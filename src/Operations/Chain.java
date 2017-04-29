package Operations;

import OperationRelations.Relational;

import java.util.Stack;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class Chain
{
    Stack<Operation> listOfOps;

    public Chain()
    {
        listOfOps = new Stack<Operation>();
    }
    public void addOp(Operation op)
    {
        listOfOps.add(op);
    }

    public Operation getNextOp()
    {
        if (listOfOps.empty())
            return null;
        listOfOps.pop();
    }

    public boolean wouldCauseRedundancy(Relational relations, Operation op)
    {
        if (relations.isCommutativeWith(op))
        {
            
            for(int i = listOfOps.size(); i > 0; i--)
            {

            }
        }
    }
}
