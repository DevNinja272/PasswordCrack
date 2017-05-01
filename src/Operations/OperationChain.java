package Operations;

import RelationalOperations.RelationalOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class OperationChain
{
    private Stack<RelationalOperation> listOfOps;
    List<StringBuilder> results;

    public OperationChain(List<String> seeds)
    {
        listOfOps = new Stack<>();
        results = new ArrayList<>(seeds.size());
        for (String s : seeds)
        {
            results.add(new StringBuilder(s));
        }
    }

    public void addOp(RelationalOperation operation)
    {
        listOfOps.add(operation);
        // Parallelize application
    }

    public boolean wouldCauseRedundancy(RelationalOperation operation)
    {
        int len = listOfOps.size();
        if (len > 0)
        {
            ListIterator<RelationalOperation> ops = listOfOps.listIterator(len);

            RelationalOperation op;
            do
            {
                op = ops.previous();
                if (op.subsumes(operation))
                {
                    return true;
                }
            } while (op.isIndependentOf(operation) && ops.hasPrevious());
        }
        return false;
    }
}
