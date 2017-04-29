import Operations.*;

/**
 * Created by Jinwook on 4/28/2017.
 */
public class DeleteLastRelation implements Relational{
    @Override
    public boolean isCommutativeWith(Operations.Operation op) {
        if (op instanceof Prepend || op instanceof DeleteFirst || op instanceof Uppercase || op instanceof Lowercase ||
                op instanceof Capitalize || op instanceof NCapitalize || op instanceof ToggleEven || op instanceof ToggleOdd)
            return true;
        return false;
    }

    @Override
    public Operations.Operation isNegatedBy(Operations.Operation op) {
        if (op instanceof Reverse)
            return DeleteFirst;
        return null;
    }

    @Override
    public boolean doesCancel(Operations.Operation op) {
        return false;
    }
}
