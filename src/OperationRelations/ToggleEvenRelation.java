package OperationRelations;
import Operations.*;

/**
 * Created by Jinwook on 4/28/2017.
 */
public class ToggleEvenRelation implements Relational
{
    @Override
    public boolean isCommutativeWith(Operation op)
    {
        return op instanceof Uppercase || op instanceof Lowercase || op instanceof NCapitalize;
    }

    @Override
    public Operations.Operation isNegatedBy(Operation op)
    {
        return null;
    }

    @Override
    public boolean doesCancel(Operation op)
    {
        return op instanceof Capitalize || op instanceof ToggleEven;
    }

    @Override
    public boolean isUsefulFor(Chain chain)
    {
        return true;
    }
}
