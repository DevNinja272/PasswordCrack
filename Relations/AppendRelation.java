import Operations.*;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class AppendRelation implements Relational{

    @Override
    public boolean isCommutativeWith(Operation op) {
        if (op instanceof Prepend || op instanceof DeleteFirst || op instanceof Capitalize)
            return true;
        return false;
    }

    @Override
    public Operation isNegatedBy(Operation op) {
        if (op instanceof Reverse)
            return new Prepend;
        return null;
    }

    @Override
    public boolean doesCancel(Operations.Operation op) {
        // TODO: Uppercase, Lowercase, Capitalize, nCapitalize, Toggle (even and odd)
        if (op instanceof DeleteLast)
            return true;
        return false;
    }
}
