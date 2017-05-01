package RelationalOperations;
import Operations.Lowercase;
import Operations.Operation;
import Operations.ToggleOdd;
import Operations.Uppercase;

public class RelationalLowercase implements RelationalOperation
{
    private final Operation op = new Lowercase();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isIndependentOf(RelationalOperation operation)
    {
        return op instanceof Uppercase;
    }

    @Override
    public boolean subsumes(RelationalOperation operation)
    {
        return operation.op() instanceof Lowercase;
    }
}
