package RelationalOperations;
import Operations.*;

public class RelationalLowercase extends RelationalOperation
{
    private final Operation op = new Lowercase();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isCommutativeWith(Operation op)
    {
        return op instanceof DeleteFirst
               || op instanceof DeleteLast
               || op instanceof Reverse
               || op instanceof Duplicate
               || op instanceof Reflect
               || op instanceof Uppercase
               || op instanceof ToggleOdd;
    }

    @Override
    public Operation isNegatedBy(Operation op)
    {
        return null;
    }

    @Override
    public boolean doesCancel(Operation op)
    {
        return op instanceof Lowercase || op instanceof ToggleEven;
    }

    @Override
    public boolean isUsefulFor(OeprationChain chain)
    {
        return true;
    }
}
