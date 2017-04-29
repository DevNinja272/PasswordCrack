import Operations.*;

/**
 * Created by Jinwook on 4/28/2017.
 */
public class ReverseRelation implements Relational{
    @Override
    public boolean isCommutativeWith(Operations.Operation op) {
        if (op instanceof Prepend || op instanceof Duplicate || op instanceof Uppercase || op instanceof Lowercase ||
                op instanceof ToggleOdd)
            return true;
        return false;
    }

    @Override
    public Operations.Operation isNegatedBy(Operations.Operation op) {
        if (op instanceof Prepend)
            return Append;
        else if (op instanceof Append)
            return Prepend;
        else if (op instanceof DeleteFirst)
            return DeleteLast;
        else if (op instanceof DeleteLast)
            return DeleteFirst;
        return null;
    }

    @Override
    public boolean doesCancel(Operations.Operation op) {
        if (op instanceof Reverse)
            return true;
        return false;
    }
}
