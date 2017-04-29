package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class DeleteLast implements Operation
{
    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        new Append().undo(s, c);
    }

    @Override
    public void undo(StringBuilder s, StringBuilder c)
    {
        new Append().apply(s, c);
    }
}
