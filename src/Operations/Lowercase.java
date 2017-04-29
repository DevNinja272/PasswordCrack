package Operations;

import java.util.Stack;

public class Lowercase implements Operation
{
    private Stack<Integer> affectedIndices = new Stack<>();

    @Override
    public void apply(StringBuilder s, StringBuilder c)
    {
        for (int i = 0; i < s.length(); i++)
        {
            char cand = s.charAt(i);
            if (Character.isUpperCase(i))
            {
                s.replace(i, i, "" + Character.toLowerCase(cand));
                affectedIndices.push(i);
            }
        }

        // TODO: For a given Operation to use the methods of its dual, if applicable, consider
        //  requiring each Operation to have its apply and undo methods as normal but also two
        //  static methods that actually apply or undo the operation independent of state.
    }

    @Override
    public void undo(StringBuilder s)
    {
        Integer index;
        while (!affectedIndices.empty())
        {
            index = affectedIndices.pop();
            s.replace(index, index, "" + Character.toUpperCase(s.charAt(index)));
        }
    }
}
