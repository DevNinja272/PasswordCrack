package Operations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class Capitalize implements Operation
{
    private boolean effectedString = false;

    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        char cand = s.charAt(0);
        if (Character.isLowerCase(cand))
        {
            s.replace(0, 0, "" + Character.toUpperCase(cand));
            effectedString = true;
        }
    }

    @Override
    public void undo(StringBuilder s, StringBuilder c)
    {
        if (effectedString)
        {
            s.replace(0, 0, "" + Character.toLowerCase(s.charAt(0)));
            effectedString = false;
        }
    }
}
