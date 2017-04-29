package Operations;

public class Append implements Operation
{
    private int lengthAffected = 0;

    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        s.append(c);
        lengthAffected = c.length();
    }

    @Override
    public void undo(StringBuilder s)
    {
        int len = s.length();
        s.delete(len - lengthAffected, len);
        lengthAffected = 0;
    }
}
