package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class ToggleOdd implements Operation
{
    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (i % 2 == 1) // odd
            {
                String character = "" + Character.toUpperCase(s.charAt(i));
                s.replace(i, i, character);
            }
        }
    }

    @Override
    public void undo(StringBuilder s, StringBuilder c)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (i % 2 == 1) // odd
            {
                String character = "" + Character.toLowerCase(s.charAt(i));
                s.replace(i, i, character);
            }
        }
    }
}
