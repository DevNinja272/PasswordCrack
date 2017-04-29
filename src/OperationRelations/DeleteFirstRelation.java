package OperationRelations;
import Operations.*;

/**
 * Created by Jinwook on 4/28/2017.
 */
public class DeleteFirstRelation implements Relational
{
    @Override
    public boolean isCommutativeWith(Operations.Operation op)
    {
        return op instanceof Append
               || op instanceof DeleteLast
               || op instanceof Uppercase
               || op instanceof Lowercase;
    }

    @Override
    public Operation isNegatedBy(Operations.Operation op)
    {
        return (op instanceof Reverse) ? new DeleteLast() : null;
    }

    @Override
    public boolean doesCancel(Operations.Operation op)
    {
        return false;
    }

    @Override
    public boolean isUsefulFor(Chain chain)
    {
        return true;
    }
}
