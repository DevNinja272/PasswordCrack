package Operations;

public class Capitalize implements Operation
{
    private boolean affectedString = false;

    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        char cand = s.charAt(0);
        if (Character.isLowerCase(cand))
        {
            s.replace(0, 0, "" + Character.toUpperCase(cand));
            affectedString = true;
        }
    }

    @Override
    public void undo(StringBuilder s)
    {
        if (affectedString)
        {
            s.replace(0, 0, "" + Character.toLowerCase(s.charAt(0)));
            affectedString = false;
        }
    }
}
