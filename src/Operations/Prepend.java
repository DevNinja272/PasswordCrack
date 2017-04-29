package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class Prepend implements Operation
{
    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        s.insert(0, c);
    }

    @Override
    public void undo(StringBuilder s)
    {
        s.deleteCharAt(0);
    }
}
