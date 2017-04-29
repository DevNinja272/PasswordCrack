package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class NCapitalize implements Operation
{
    @Override
    public StringBuilder apply(StringBuilder s, StringBuilder c)
    {
        String uppercase = s.substring(1, s.length()).toUpperCase();
        return s.replace(1, s.length(), uppercase);
    }

    @Override
    public StringBuilder undo(StringBuilder s, StringBuilder c)
    {
        String lowercase = s.substring(1, s.length()).toLowerCase();
        return s.replace(1, s.length(), lowercase);
    }
}
