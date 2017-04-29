package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class NCapitalize implements Operation
{
    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        String uppercase = s.substring(1, s.length()).toUpperCase();
        s.replace(1, s.length(), uppercase);
    }

    @Override
    public void undo(StringBuilder s)
    {
        String lowercase = s.substring(1, s.length()).toLowerCase();
        s.replace(1, s.length(), lowercase);
    }
}
