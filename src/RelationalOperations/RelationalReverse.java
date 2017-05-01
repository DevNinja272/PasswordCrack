package RelationalOperations;
import Operations.*;

public class RelationalReverse implements RelationalOperation
{
    private final Operation op = new Reverse();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isIndependentOf(RelationalOperation operation)
    {
        Operation op = operation.op();
        return op instanceof Prepend
               || op instanceof Duplicate
               || op instanceof Uppercase
               || op instanceof Lowercase
               || op instanceof ToggleOdd;
    }

    @Override
    public RelationalOperation isNegatedBy(RelationalOperation operation)
    {
        Operation op = operation.op();
        if (op instanceof Prepend) { return new RelationalAppend(); }
        else if (op instanceof Append) { return new RelationalPrepend(); }
        else if (op instanceof DeleteFirst) { return new RelationalDeleteLast(); }
        else if (op instanceof DeleteLast) { return new RelationalDeleteFirst(); }

        return null;
    }

    @Override
    public boolean subsumes(RelationalOperation operation)
    {
        return operation.op() instanceof Reverse;
    }

    @Override
    public boolean isUsefulFor(OperationChain chain)
    {
        return true;
    }
}
