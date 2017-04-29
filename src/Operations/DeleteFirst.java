package Operations;

public class DeleteFirst implements Operation
{
    private char deleted = '\0';

    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        deleted = s.charAt(0);
        s.deleteCharAt(0);
    }

    @Override
    public void undo(StringBuilder s)
    {
        if (deleted != '\0')
        {
            s.insert(0, deleted);
            deleted = '\0';
        }
    }
}
