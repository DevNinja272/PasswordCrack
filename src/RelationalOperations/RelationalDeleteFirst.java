package RelationalOperations;
import Operations.*;

public class RelationalDeleteFirst implements RelationalOperation
{
    private final Operation op = new DeleteFirst();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isIndependentOf(RelationalOperation operation)
    {
        Operation op = operation.op();
        return op instanceof Append
               || op instanceof DeleteLast
               || op instanceof Uppercase
               || op instanceof Lowercase;
    }

    @Override
    public RelationalOperation isNegatedBy(RelationalOperation operation)
    {
        return (operation.op() instanceof Reverse) ? new RelationalDeleteLast() : null;
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
