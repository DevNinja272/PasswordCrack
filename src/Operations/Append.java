package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class Append implements Operation
{
    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        s.append(c);
    }

    @Override
    public void undo(StringBuilder s, StringBuilder c)
    {
        s.deleteCharAt(s.length() - 1);
    }
}
