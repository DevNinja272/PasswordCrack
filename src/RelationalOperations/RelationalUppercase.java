package RelationalOperations;
import Operations.*;

public class RelationalUppercase implements RelationalOperation
{
    private final Operation op = new Uppercase();

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
               || op instanceof Capitalize
               || op instanceof NCapitalize
               || op instanceof ToggleOdd
               || op instanceof ToggleEven
               || op instanceof Lowercase;
    }

    @Override
    public RelationalOperation isNegatedBy(RelationalOperation op)
    {
        return null;
    }

    @Override
    public boolean subsumes(RelationalOperation operation)
    {
        Operation op = operation.op();
        return op instanceof Capitalize
               || op instanceof NCapitalize
               || op instanceof ToggleOdd
               || op instanceof ToggleEven;
    }

    @Override
    public boolean isUsefulFor(OperationChain chain)
    {
        return true;
    }
}
