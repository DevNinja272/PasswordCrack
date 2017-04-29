package OperationRelations;
import Operations.*;

/**
 * Created by Jinwook on 4/28/2017.
 */
public class ToggleOddRelation implements Relational
{
    @Override
    public boolean isCommutativeWith(Operations.Operation op)
    {
        return op instanceof Reverse
               || op instanceof Uppercase
               || op instanceof Lowercase
               || op instanceof ToggleEven;
    }

    @Override
    public Operations.Operation isNegatedBy(Operations.Operation op)
    {
        return null;
    }

    @Override
    public boolean doesCancel(Operations.Operation op)
    {
        return op instanceof ToggleOdd;
    }

    @Override
    public boolean isUsefulFor(Chain chain)
    {
        return true;
    }
}
