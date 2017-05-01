package Operations;

import java.util.Stack;

public class ToggleEven implements Operation
{
    private Stack<Integer> affectedIndices = new Stack<>();

    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        for (int i = 0; i < s.length(); i += 2)
        {
            char cand = s.charAt(i);
            if (Character.isLowerCase(cand))
            {
                s.replace(i, i, "" + Character.toUpperCase(cand));
                affectedIndices.push(i);
            }
        }
    }

    @Override
    public void undo(StringBuilder s)
    {
        Integer index;
        while (!affectedIndices.empty())
        {
            index = affectedIndices.pop();
            s.replace(index, index, "" + Character.toLowerCase(s.charAt(index)));
        }
    }
}
