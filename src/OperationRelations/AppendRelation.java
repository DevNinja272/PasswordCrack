package OperationRelations;
import Operations.*;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class AppendRelation implements Relational
{
    @Override
    public boolean isCommutativeWith(Operation op)
    {
        return op instanceof Prepend || op instanceof DeleteFirst || op instanceof Capitalize;
    }

    @Override
    public Operation isNegatedBy(Operation op)
    {
        return (op instanceof Reverse) ? new Prepend() : null;
    }

    @Override
    public boolean doesCancel(Operation op)
    {
        // TODO: Uppercase, Lowercase, Capitalize, nCapitalize, Toggle (even and odd)
        return op instanceof DeleteLast;
    }

    @Override
    public boolean isUsefulFor(Chain chain)
    {
        return true;
    }
}
