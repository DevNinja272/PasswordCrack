package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class ToggleOdd implements Operation
{
    @Override
    public StringBuilder apply(StringBuilder s, StringBuilder c)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (i % 2 == 1) // odd
            {
                String character = "" + Character.toUpperCase(s.charAt(i));
                s.replace(i, i, character);
            }
        }
        return s;
    }

    @Override
    public StringBuilder undo(StringBuilder s, StringBuilder c)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (i % 2 == 1) // odd
            {
                String character = "" + Character.toLowerCase(s.charAt(i));
                s.replace(i, i, character);
            }
        }
        return s;
    }
}
