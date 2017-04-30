package RelationalOperations;
import Operations.*;

public class RelationalDeleteLast extends RelationalOperation
{
    private final Operation op = new DeleteLast();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isCommutativeWith(Operations.Operation op)
    {
        return op instanceof Prepend
               || op instanceof DeleteFirst
               || op instanceof Uppercase
               || op instanceof Lowercase
               || op instanceof Capitalize
               || op instanceof NCapitalize
               || op instanceof ToggleEven
               || op instanceof ToggleOdd;
    }

    @Override
    public Operations.Operation isNegatedBy(Operations.Operation op)
    {
        return (op instanceof Reverse) ? new DeleteFirst() : null;
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
