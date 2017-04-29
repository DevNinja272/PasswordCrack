package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class Lowercase implements Operation
{
    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        new Uppercase().undo(s, c);
    }

    @Override
    public void undo(StringBuilder s)
    {
        new Uppercase().apply(s, c);
    }
}
