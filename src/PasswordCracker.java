import Operations.Operation;

import java.lang.reflect.Array;
import java.util.HashSet;

/**
 * Created by Jinwook on 4/29/2017.
 */
public class PasswordCracker {

    HashSet<String> crackableHashes;
    Array words;
    public PasswordCracker(HashSet<String> hashDict, Array dictWords)
    {
        crackableHashes = hashDict;
        words = dictWords;
    }

    public void applyNextOperation(String hash, Operation op)
    {

    }


}
