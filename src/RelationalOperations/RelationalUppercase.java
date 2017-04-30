package RelationalOperations;
import Operations.*;

public class RelationalUppercase extends RelationalOperation
{
    private final Operation op = new Uppercase();

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
               || op instanceof Capitalize
               || op instanceof NCapitalize
               || op instanceof ToggleOdd
               || op instanceof ToggleEven
               || op instanceof Lowercase;
    }

    @Override
    public Operation isNegatedBy(Operation op)
    {
        return null;
    }

    @Override
    public boolean doesCancel(Operation op)
    {
        return op instanceof Capitalize
               || op instanceof NCapitalize
               || op instanceof ToggleOdd
               || op instanceof ToggleEven;
    }

    @Override
    public boolean isUsefulFor(OeprationChain chain)
    {
        return true;
    }
}
