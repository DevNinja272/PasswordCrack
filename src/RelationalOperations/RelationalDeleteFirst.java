package RelationalOperations;
import Operations.*;

public class RelationalDeleteFirst extends RelationalOperation
{
    private final Operation op = new DeleteFirst();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isCommutativeWith(Operations.Operation op)
    {
        return op instanceof Append
               || op instanceof DeleteLast
               || op instanceof Uppercase
               || op instanceof Lowercase;
    }

    @Override
    public Operation isNegatedBy(Operations.Operation op)
    {
        return (op instanceof Reverse) ? new DeleteLast() : null;
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
