package OperationRelations;
import Operations.*;

/**
 * Created by Jinwook on 4/28/2017.
 */
public class DeleteLastRelation implements Relational
{
    @Override
    public boolean isCommutativeWith(Operations.Operation op)
    {
        return op instanceof Prepend
               || op instanceof DeleteFirst
               || op instanceof Uppercase
               || op instanceof Lowercase
               || op instanceof Capitalize
               || op instanceof NCapitalize
               || op instanceof ToggleEven
               || op instanceof ToggleOdd;
    }

    @Override
    public Operations.Operation isNegatedBy(Operations.Operation op)
    {
        return (op instanceof Reverse) ? new DeleteFirst() : null;
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
