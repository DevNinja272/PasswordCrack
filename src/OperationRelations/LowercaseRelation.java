package OperationRelations;
import Operations.*;

/**
 * Created by Jinwook on 4/28/2017.
 */
public class LowercaseRelation implements Relational
{
    @Override
    public boolean isCommutativeWith(Operation op)
    {
        return op instanceof DeleteFirst
               || op instanceof DeleteLast
               || op instanceof Reverse
               || op instanceof Duplicate
               || op instanceof Reflect
               || op instanceof Uppercase
               || op instanceof ToggleOdd;
    }

    @Override
    public Operation isNegatedBy(Operation op)
    {
        return null;
    }

    @Override
    public boolean doesCancel(Operation op)
    {
        return op instanceof Lowercase || op instanceof ToggleEven;
    }

    @Override
    public boolean isUsefulFor(Chain chain)
    {
        return true;
    }
}
