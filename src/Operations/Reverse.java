package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class Reverse implements Operation
{
    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        s.reverse();
    }

    @Override
    public void undo(StringBuilder s)
    {
        s.reverse();
    }
}
