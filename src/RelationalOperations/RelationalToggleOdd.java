package RelationalOperations;
import Operations.*;

public class RelationalToggleOdd extends RelationalOperation
{
    private final Operation op = new ToggleOdd();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isCommutativeWith(Operations.Operation op)
    {
        return op instanceof Reverse
               || op instanceof Uppercase
               || op instanceof Lowercase
               || op instanceof ToggleEven;
    }

    @Override
    public Operations.Operation isNegatedBy(Operations.Operation op)
    {
        return null;
    }

    @Override
    public boolean doesCancel(Operations.Operation op)
    {
        return op instanceof ToggleOdd;
    }

    @Override
    public boolean isUsefulFor(OeprationChain chain)
    {
        return true;
    }
}
