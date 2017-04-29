import Operation.*;
import com.sun.xml.internal.ws.util.xml.NamespaceContextExAdaper;

/**
 * Created by Jinwook on 4/28/2017.
 */
public class UppercaseRelation implements Relational{
    @Override
    public boolean isCommutativeWith(Operations.Operation op) {
        if (op instanceof DeleteFirst || op instanceof DeleteLast || op instanceof Reverse || op instanceof Duplicate ||
                op instanceof Reflect || op instanceof Capitalize || op instanceof NCapitalize || op instanceof ToggleOdd ||
                op instanceof ToggleEven || op instanceof Lowercase)
            return true;
        return false;
    }

    @Override
    public Operations.Operation isNegatedBy(Operations.Operation op) {
        return null;
    }

    @Override
    public boolean doesCancel(Operations.Operation op) {
        if (op instanceof Capitalize || op instanceof NCapitalize || op instanceof ToggleOdd || op instanceof ToggleEven)
            return true;
        return false;
    }
}
