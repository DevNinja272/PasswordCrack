package Operations;

public class Reverse implements Operation
{
    private boolean affectedString = false;

    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        s.reverse();
        affectedString = true;
    }

    @Override
    public void undo(StringBuilder s)
    {
        if (affectedString)
        {
            s.reverse();
            affectedString = false;
        }
    }
}
