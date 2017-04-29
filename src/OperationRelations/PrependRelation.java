package OperationRelations;
import Operations.*;

/**
 * Created by Jinwook on 4/28/2017.
 */
public class PrependRelation implements Relational
{
    // TODO: Expansion - prepend.reflect == reflect.append.prepend, s.pre.ncap == s.upp.pre, toggle

    @Override
    public boolean isCommutativeWith(Operation op)
    {
        // TODO: Prepend-depends on if same char, Uppercase, Lowercase
        return op instanceof Append || op instanceof DeleteLast;
    }

    @Override
    public Operation isNegatedBy(Operation op)
    {
        return (op instanceof Reverse) ? new Append() : null;
    }

    @Override
    public boolean doesCancel(Operation op)
    {
        return op instanceof DeleteFirst;
    }

    @Override
    public boolean isUsefulFor(Chain chain)
    {
        return true;
    }
}
