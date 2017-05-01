package RelationalOperations;
import Operations.*;

public class RelationalCapitalize implements RelationalOperation
{
    private final Operation op = new Capitalize();

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

    @Override
    public boolean isUsefulFor(OperationChain chain)
    {
        return true;
    }
}
