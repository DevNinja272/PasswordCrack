package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class Lowercase implements Operation
{
    @Override
    public StringBuilder apply(StringBuilder s, StringBuilder c)
    {
        return new Uppercase().undo(s, c);
    }

    @Override
    public StringBuilder undo(StringBuilder s, StringBuilder c)
    {
        return new Uppercase().apply(s, c);
    }
}
