package OperationRelations;
import Operations.*;

/**
 * Created by Jinwook on 4/28/2017.
 */
public class NCapitalizeRelation implements Relational
{
    @Override
    public boolean isCommutativeWith(Operation op)
    {
        return op instanceof Uppercase
               || op instanceof Lowercase
               || op instanceof ToggleEven
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
        return op instanceof NCapitalize;
    }

    @Override
    public boolean isUsefulFor(Chain chain)
    {
        return true;
    }
}
