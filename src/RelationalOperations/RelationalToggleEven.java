package RelationalOperations;
import Operations.*;

public class RelationalToggleEven implements RelationalOperation
{
    private final Operation op = new ToggleEven();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isIndependentOf(RelationalOperation operation)
    {
        Operation op = operation.op();
        return op instanceof Uppercase || op instanceof Lowercase || op instanceof NCapitalize;
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
        return op instanceof Capitalize || op instanceof ToggleEven;
    }

    @Override
    public boolean isUsefulFor(OperationChain chain)
    {
        return true;
    }
}
