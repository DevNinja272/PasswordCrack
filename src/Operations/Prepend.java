package Operations;

public class Prepend implements Operation
{
    private boolean applied = false;

    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        s.insert(0, c.charAt(0));
        applied = true;
    }

    @Override
    public void undo(StringBuilder s)
    {
        if (applied)
        {
            s.deleteCharAt(0);
            applied = false;
        }
    }
}
