package Operations;

import RelationalOperations.RelationalOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class OeprationChain
{
    private Stack<Operation> listOfOps;
    List<StringBuilder> results;

    public OeprationChain(List<String> seeds)
    {
        listOfOps = new Stack<>();
        results = new ArrayList<>(seeds.size());
        for (String s : seeds)
        {
            results.add(new StringBuilder(s));
        }
    }

    public void addOp(Operation op)
    {
        listOfOps.add(op);
    }

    public boolean wouldCauseRedundancy(RelationalOperation relations, Operation op)
    {
        if (relations.isCommutativeWith(op))
        {
            for (int i = listOfOps.size(); i > 0; i--)
            {

            }
        }
    }
}
