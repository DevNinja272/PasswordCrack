package OperationRelations;
import Operations.*;

/**
 * Created by Jinwook on 4/28/2017.
 */
public class DuplicateRelation implements Relational
{
    @Override
    public boolean isCommutativeWith(Operation op)
    {
        return op instanceof Reverse
               || op instanceof Uppercase
               || op instanceof Lowercase
               || op instanceof ToggleEven;
    }

    @Override
    public Operation isNegatedBy(Operation op)
    {
        return null;
    }

    @Override
    public boolean doesCancel(Operation op)
    {
        return false;
    }

    @Override
    public boolean isUsefulFor(Chain chain)
    {
        return true;
    }
}
