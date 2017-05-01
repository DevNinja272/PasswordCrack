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
        return operation.op() instanceof ToggleOdd;
    }

    @Override
    public boolean subsumes(RelationalOperation operation)
    {
        return operation.op() instanceof ToggleEven;
    }
}
