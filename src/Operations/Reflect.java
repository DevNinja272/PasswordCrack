package Operations;

public class Reflect implements Operation
{
    private boolean applied = false;

    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        s.append(s.reverse());
        applied = true;
    }

    @Override
    public void undo(StringBuilder s)
    {
        if (applied)
        {
            int len = s.length();
            s.delete(len / 2, len);
            applied = false;
        }
    }
}
