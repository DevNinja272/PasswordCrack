package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class DeleteFirst implements Operation
{
    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        new Prepend().undo(s, c);
    }

    @Override
    public void undo(StringBuilder s, StringBuilder c)
    {
        new Prepend().apply(s, c);
    }
}
