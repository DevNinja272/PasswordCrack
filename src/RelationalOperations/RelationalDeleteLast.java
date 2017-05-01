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
        return op instanceof Prepend || op instanceof DeleteFirst;
    }

    @Override
    public boolean subsumes(RelationalOperation operation)
    {
        return false;
    }
}
