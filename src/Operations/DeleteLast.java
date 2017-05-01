package Operations;

public class DeleteLast implements Operation
{
    private char deleted = '\0';

    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        int len = s.length();
        deleted = s.charAt(len);
        s.deleteCharAt(len);
    }

    @Override
    public void undo(StringBuilder s)
    {
        if (deleted != '\0')
        {
            s.append(deleted);
            deleted = '\0';
        }
    }
}
