import RelationalOperations.RelationalAppend;
import RelationalOperations.RelationalOperation;
import Operations.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PasswordCracker
{
    private static final RelationalOperation[] operations = {new RelationalAppend()};

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

    public void applyNextOperation(String hash, Operation op)
    {
    }
}