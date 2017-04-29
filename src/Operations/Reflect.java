package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class Reflect implements Operation
{
    int size = 0;

    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        size = s.length();
        s.append(s.reverse());
    }

    @Override
    public void undo(StringBuilder s, StringBuilder c)
    {
        s.delete(size, s.length());
    }
}
