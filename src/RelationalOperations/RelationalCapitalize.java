package RelationalOperations;
import Operations.*;

public class RelationalCapitalize extends RelationalOperation
{
    private final Operation op = new Capitalize();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isCommutativeWith(Operations.Operation op)
    {
        return op instanceof Append || op instanceof DeleteLast;
    }

    @Override
    public Operations.Operation isNegatedBy(Operations.Operation op)
    {
        return null;
    }

    @Override
    public boolean doesCancel(Operations.Operation op)
    {
        return false;
    }

    @Override
    public boolean isUsefulFor(OeprationChain chain)
    {
        return true;
    }
}
