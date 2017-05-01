package RelationalOperations;
import Operations.*;

public class RelationalNCapitalize implements RelationalOperation
{
    private final Operation op = new NCapitalize();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isIndependentOf(RelationalOperation operation)
    {
        Operation op = operation.op();
        return op instanceof Uppercase
               || op instanceof Lowercase
               || op instanceof ToggleEven
               || op instanceof ToggleOdd;
    }

    @Override
    public RelationalOperation isNegatedBy(RelationalOperation operation)
    {
        return null;
    }

    @Override
    public boolean subsumes(RelationalOperation operation)
    {
        return operation.op() instanceof NCapitalize;
    }

    @Override
    public boolean isUsefulFor(OperationChain chain)
    {
        return true;
    }
}
