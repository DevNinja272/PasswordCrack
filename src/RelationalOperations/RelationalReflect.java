package RelationalOperations;
import Operations.*;

public class RelationalReflect implements RelationalOperation
{
    private final Operation op = new Reflect();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isIndependentOf(RelationalOperation operation)
    {
        Operation op = operation.op();
        return op instanceof Uppercase || op instanceof Lowercase || op instanceof ToggleEven;
    }

    @Override
    public RelationalOperation isNegatedBy(RelationalOperation operation)
    {
        return null;
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
