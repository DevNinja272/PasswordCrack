import Operation.*;

/**
 * Created by Jinwook on 4/28/2017.
 */
public class CapitalizeRelation implements Relational{
    @Override
    public boolean isCommutativeWith(Operations.Operation op) {
        if (op instanceof Append || op instanceof DeleteLast)
            return true;
        return false;
    }

    @Override
    public Operations.Operation isNegatedBy(Operations.Operation op) {
        return null;
    }

    @Override
    public boolean doesCancel(Operations.Operation op) {
        return false;
    }
}
