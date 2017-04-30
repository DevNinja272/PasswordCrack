package RelationalOperations;
import Operations.*;

public class RelationalReverse extends RelationalOperation
{
    private final Operation op = new Reverse();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isCommutativeWith(Operations.Operation op)
    {
        return op instanceof Prepend
               || op instanceof Duplicate
               || op instanceof Uppercase
               || op instanceof Lowercase
               || op instanceof ToggleOdd;
    }

    @Override
    public Operations.Operation isNegatedBy(Operations.Operation op)
    {
        if (op instanceof Prepend) { return new Append(); }
        else if (op instanceof Append) { return new Prepend(); }
        else if (op instanceof DeleteFirst) { return new DeleteLast(); }
        else if (op instanceof DeleteLast) { return new DeleteFirst(); }

        return null;
    }

    @Override
    public boolean doesCancel(Operations.Operation op)
    {
        return op instanceof Reverse;
    }

    @Override
    public boolean isUsefulFor(OeprationChain chain)
    {
        return true;
    }
}
