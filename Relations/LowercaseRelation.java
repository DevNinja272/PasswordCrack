import Operation.*;
/**
 * Created by Jinwook on 4/28/2017.
 */
public class LowercaseRelation implements Relational{
    @Override
    public boolean isCommutativeWith(Operations.Operation op) {
        if (op instanceof DeleteFirst || op instanceof DeleteLast || op instanceof Reverse || op instanceof Duplicate ||
                op instanceof Reflect || op instanceof Uppercase || op instanceof ToggleOdd)
        return false;
    }

    @Override
    public Operations.Operation isNegatedBy(Operations.Operation op) {
        return null;
    }

    @Override
    public boolean doesCancel(Operations.Operation op) {
        if (op instanceof Lowercase || op instanceof ToggleEven)
            return true;
        return false;
    }
}
