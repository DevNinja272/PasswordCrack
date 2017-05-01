import Operations.Append;
import Operations.Operation;
import Operations.OperationChain;
import Operations.Prepend;
import RelationalOperations.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PasswordCracker
{
    private static final RelationalOperation[] operations = {new RelationalAppend(),
                                                             new RelationalCapitalize(),
                                                             new RelationalDeleteFirst(),
                                                             new RelationalDeleteLast(),
                                                             new RelationalDuplicate(),
                                                             new RelationalLowercase(),
                                                             new RelationalNCapitalize(),
                                                             new RelationalPrepend(),
                                                             new RelationalReflect(),
                                                             new RelationalReverse(),
                                                             new RelationalToggleEven(),
                                                             new RelationalToggleOdd()};

    private ExecutorService     executorService;
    private int                 cores;
    private HashSet<String>     passwordHashes;
    private List<String>        words;
    private List<StringBuilder> mangledWords;
    private int depth = 0;

    // TODO: NEED TO INCLUDE PASSWORD SALTS

    public PasswordCracker(List<String> passwordHashes, List<String> wordList)
    {
        this.cores = Runtime.getRuntime().availableProcessors();
        this.executorService = Executors.newFixedThreadPool(this.cores);

        this.passwordHashes = new HashSet<String>(passwordHashes);
        this.words = new ArrayList<>(wordList);
        this.mangledWords = new ArrayList<>(words.size());

        for (String word : words)
        {
            this.mangledWords.add(new StringBuilder(word));
        }
    }

    private void applyNextOperation(OperationChain chain)
    {
        if (depth == 3)
        {
            return;
        }

        depth += 1;
        for (RelationalOperation op : operations)
        {
            if (!chain.wouldCauseRedundancy(op))
            {
                applyAndCheck(chain, op);
                applyNextOperation(chain);
                undoOperation(chain);
            }
        }

        depth -= 1;
    }

    private void applyAndCheck(OperationChain chain, RelationalOperation operation)
    {
        if (operation.op() instanceof Append || operation.op() instanceof Prepend)
        {
            applyAndCheckWithInput(chain, operation);
        }
        else
        {
            List<Runnable> tasks = new ArrayList<>(cores);
            for (int i = 0; i < cores; i++)
            {
                int j = i;
                tasks.add(() ->
                          {
                              for (int index = j * words.size() / cores; index
                                                                         < (j + 1) * words.size()
                                                                           / cores; index++)
                              {
                                  StringBuilder mangledWord = mangledWords.get(index);
                                  int           origLen     = mangledWord.length();

                                  operation.op().apply(mangledWord, null);
                                  if (!(origLen >= 8
                                        && origLen < mangledWord.length()
                                        && !(operation.op() instanceof Prepend)))
                                  {
                                      for (String hash : passwordHashes)
                                      {
                                          String trimmed = mangledWord.toString();
                                          trimmed = trimmed.substring(0,
                                                                      Math.max(8,
                                                                               trimmed.length()));
                                          if (jcrypt.crypt(hash.substring(0, 2), trimmed).equals(
                                                  hash))
                                          {
                                              System.out.println("Password for "
                                                                 + hash
                                                                 + " is "
                                                                 + trimmed);
                                          }
                                      }
                                  }
                              }
                          });
            }

            for (Runnable task : tasks)
            {
                executorService.execute(task);
            }
        }
    }

    private void applyAndCheckWithInput(OperationChain chain, RelationalOperation operation)
    {

    }

    private void undoOperation(OperationChain chain)
    {
        List<Runnable>      tasks     = new ArrayList<>(cores);
        RelationalOperation operation = chain.pop();

        for (int i = 0; i < cores; i++)
        {
            int j = i;
            tasks.add(() ->
                      {
                          for (int index = j * words.size() / cores; index
                                                                     < (j + 1) * words.size()
                                                                       / cores; index++)
                          {
                              StringBuilder mangledWord = mangledWords.get(index);
                              operation.op().undo(mangledWord);
                          }
                      });

            for (Runnable task : tasks)
            {
                executorService.execute(task);
            }
        }
    }

    private void undoOperationWithInput(OperationChain chain)
    {

    }

    public boolean applyMangleAndCheckMatches(Operation op)
    {
        for (int i = 0; i < this.mangledWords.size(); i++)
        {
            if (op instanceof Append || op instanceof Prepend)
            {
                for (int asciiChar = 0x20; asciiChar <= (char) 0x7E; i++)
                {
                    op.apply(mangledWords.get(i), new StringBuilder("" + asciiChar));
                    for (String hash : passwordHashes)
                    {
                        if (mangledWords.get(i).equals(hash))
                        {
                            return true;
                        }
                    }

                    op.undo(mangledWords.get(i));
                }
            }
            else
            {
                op.apply(mangledWords.get(i), null);
                for (String hash : passwordHashes)
                {
                    if (mangledWords.get(i).equals(hash))
                    {
                        return true;
                    }
                }

                op.undo(mangledWords.get(i));
            }
        }
        return false;
    }
}
