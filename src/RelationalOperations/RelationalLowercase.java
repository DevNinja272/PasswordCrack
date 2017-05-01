package RelationalOperations;
import Operations.*;

public class RelationalLowercase implements RelationalOperation
{
    private final Operation op = new Lowercase();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isIndependentOf(RelationalOperation operation)
    {
        Operation op = operation.op();
        return op instanceof DeleteFirst
               || op instanceof DeleteLast
               || op instanceof Reverse
               || op instanceof Duplicate
               || op instanceof Reflect
               || op instanceof Uppercase
               || op instanceof ToggleOdd;
    }

    @Override
    public RelationalOperation isNegatedBy(RelationalOperation operation)
    {
        return null;
    }

    @Override
    public boolean subsumes(RelationalOperation operation)
    {
        Operation op = operation.op();
        return op instanceof Lowercase || op instanceof ToggleEven;
    }

    @Override
    public boolean isUsefulFor(OperationChain chain)
    {
        return true;
    }
}
