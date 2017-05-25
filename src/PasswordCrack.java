import Operations.OperationChain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PasswordCrack
{

    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            Fail("Unrecognized parameters: " + args.toString());
        }

        List<String> hashes = new ArrayList<>(25);
        List<String> words = new ArrayList<>(10000);

        // Get all password hashes from file and add any additional words
        try (BufferedReader reader = new BufferedReader(new FileReader(args[1])))
        {
            // michael:atbWfKL4etk4U:500:500:Michael Ferris:/home/michael:/bin/bash
            for (String line = reader.readLine(); line != null; line = reader.readLine())
            {
                String[] sections = line.split(":");
                hashes.add(sections[1]);
                words.add(sections[0]);

                String[] names = sections[2].split("\\w+");
                Collections.addAll(words, names);
            }
        }
        catch (IOException ioe)
        {
            Fail("Error reading password hashes: " + ioe.getLocalizedMessage());
        }
        catch (IndexOutOfBoundsException ioobe)
        {
            Fail("Error reading password hashes: file not in expected format.");
        }

        // Get all words from file
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0])))
        {
            for (String line = reader.readLine(); line != null; line = reader.readLine())
            {
                words.add(line.trim());
            }
        }
        catch (IOException ioe)
        {
            Fail("Error reading words list: " + ioe.getLocalizedMessage());
        }

        PasswordCracker cracker = new PasswordCracker(hashes, words);
        cracker.applyNextOperation(new OperationChain(words));
    }

    static void Log(String message)
    {
        System.out.println(message);
    }

    static void Fail(String message)
    {
        System.out.println(message);
        System.out.flush();
        System.exit(-1);
    }
}
