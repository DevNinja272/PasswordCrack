import Operations.Append;
import Operations.Operation;
import Operations.OperationChain;
import Operations.Prepend;
import RelationalOperations.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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

    private HashSet<String>     passwordHashes;
    private List<String>        words;
    private List<StringBuilder> mangledWords;

    // TODO: NEED TO INCLUDE PASSWORD SALTS

    public PasswordCracker(List<String> passwordHashes, List<String> wordList)
    {
        this.passwordHashes = new HashSet<String>(passwordHashes);
        this.words = new ArrayList<>(wordList);
        this.mangledWords = new ArrayList<>(words.size());

        for (String word : words)
        {
            this.mangledWords.add(new StringBuilder(word));
        }
    }

    public void applyNextOperation(OperationChain chain)
    {
        for (RelationalOperation op: operations)
        {
            if (!chain.wouldCauseRedundancy(op))
            {
                // apply mangle and check if it matches with any of the hashes
                chain.addOp(op);
                applyNextOperation(chain);
            }
            else
            {
                applyNextOperation(chain);
            }
        }
    }

    public boolean applyMangleAndCheckMatches(Operation op)
    {
        for (int i = 0; i < this.mangledWords.size(); i++)
        {
            if (op instanceof Append || op instanceof Prepend)
            {
                for (int asciiChar = 0x20; asciiChar <= 0x7E; i++)
                {
                    op.apply(mangledWords[i], (char) asciiChar);
                    for (String hash : passwordHashes)
                        if (mangledWords[i].equals(hash))
                            return true;
                    op.undo(mangledWords[i]);
                }
            }
            else
            {
                op.apply(mangledWords[i], "");
                for (String hash : passwordHashes)
                    if (mangledWords[i].equals(hash))
                        return true;
                op.undo(mangledWords[i]);
            }
        }
        return false;
    }
}
