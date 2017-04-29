package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class ToggleEven implements Operation
{
    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        for (int i = 0; i < s.length(); i += 2)
        {
            String character = "" + Character.toUpperCase(s.charAt(i));
            s.replace(i, i, character);
        }
    }

    @Override
    public void undo(StringBuilder s)
    {
        for (int i = 0; i < s.length(); i += 2)
        {
            String character = "" + Character.toUpperCase(s.charAt(i));
            s.replace(i, i, character);
        }
    }
}
