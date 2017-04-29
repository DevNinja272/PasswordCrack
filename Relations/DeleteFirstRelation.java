import Operations.*;

/**
 * Created by Jinwook on 4/28/2017.
 */
public class DeleteFirstRelation implements Relational {
    @Override
    public boolean isCommutativeWith(Operations.Operation op) {
        if (op instanceof Append || op instanceof DeleteLast || op instanceof Uppercase || op instanceof Lowercase)
            return true;
        return false;
    }

    @Override
    public Operations.Operation isNegatedBy(Operations.Operation op) {
        if (op instanceof Reverse)
            return Operations.DeleteLast;
        return null;
    }

    @Override
    public boolean doesCancel(Operations.Operation op) {
        return false;
    }
}
