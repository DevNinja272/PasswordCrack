package RelationalOperations;
import Operations.*;

public class RelationalToggleEven extends RelationalOperation
{
    private final Operation op = new ToggleEven();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isCommutativeWith(Operation op)
    {
        return op instanceof Uppercase || op instanceof Lowercase || op instanceof NCapitalize;
    }

    @Override
    public Operations.Operation isNegatedBy(Operation op)
    {
        return null;
    }

    @Override
    public boolean doesCancel(Operation op)
    {
        return op instanceof Capitalize || op instanceof ToggleEven;
    }

    @Override
    public boolean isUsefulFor(OeprationChain chain)
    {
        return true;
    }
}
