package RelationalOperations;
import Operations.*;

public class RelationalDeleteLast implements RelationalOperation
{
    private final Operation op = new DeleteLast();

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
               || op instanceof DeleteFirst
               || op instanceof Uppercase
               || op instanceof Lowercase
               || op instanceof Capitalize
               || op instanceof NCapitalize
               || op instanceof ToggleEven
               || op instanceof ToggleOdd;
    }

    @Override
    public RelationalOperation isNegatedBy(RelationalOperation operation)
    {
        return (operation.op() instanceof Reverse) ? new RelationalDeleteFirst() : null;
    }

    @Override
    public boolean subsumes(RelationalOperation operation)
    {
        return false;
    }

    @Override
    public boolean isUsefulFor(OperationChain chain)
    {
        return true;
    }
}
