package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class Uppercase implements Operation
{
    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        String uppercase = s.toString().toUpperCase();
        s.replace(0, s.length(), uppercase);
    }

    @Override
    public void undo(StringBuilder s)
    {
        String lowercase = s.toString().toLowerCase();
        s.replace(0, s.length(), lowercase);
    }
}
