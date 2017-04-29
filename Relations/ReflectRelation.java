import Operation.*;
/**
 * Created by Jinwook on 4/28/2017.
 */
public class ReflectRelation implements Relational{
    @Override
    public boolean isCommutativeWith(Operations.Operation op) {
        if (op instanceof Uppercase || op instanceof Lowercase || op instanceof ToggleEven)
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
