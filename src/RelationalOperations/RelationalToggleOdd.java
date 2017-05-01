package RelationalOperations;
import Operations.*;

public class RelationalToggleOdd implements RelationalOperation
{
    private final Operation op = new ToggleOdd();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isIndependentOf(RelationalOperation operation)
    {
        Operation op = operation.op();
        return op instanceof ToggleEven || op instanceof Capitalize;
    }

    @Override
    public boolean subsumes(RelationalOperation operation)
    {
        return operation.op() instanceof ToggleOdd;
    }
}
