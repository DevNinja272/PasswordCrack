package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class Duplicate implements Operation
{
    private int size = 0;

    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        size = s.length();
        s.append(s);
    }

    @Override
    public void undo(StringBuilder s, StringBuilder c)
    {
        s.delete(size, s.length());
    }
}
