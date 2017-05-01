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
        return op instanceof Append || op instanceof DeleteLast;
    }

    @Override
    public boolean subsumes(RelationalOperation operation)
    {
        return false;
    }
}
