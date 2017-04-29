import Operations.*;

/**
 * Created by Jinwook on 4/28/2017.
 */
public class PrependRelation implements Relational{
    // TODO: Expansion - prepend.reflect == reflect.append.prepend, s.pre.ncap == s.upp.pre, toggle

    @Override
    public boolean isCommutativeWith(Operation op) {
        // TODO: Prepend-depends on if same char, Uppercase, Lowercase
        if (op instanceof Append || op instanceof Operations.DeleteLast)
            return true;
        return false;
    }

    @Override
    public Operation isNegatedBy(Operations.Operation op) {
        if (op instanceof Operations.Reverse)
            return new Append;
        return false;
    }

    @Override
    public boolean doesCancel(Operations.Operation op) {
        if (op instanceof Operations.DeleteFirst)
            return true;
        return false;
    }
}
