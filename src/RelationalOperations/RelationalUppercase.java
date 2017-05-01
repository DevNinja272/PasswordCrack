package RelationalOperations;
import Operations.*;

public class RelationalUppercase implements RelationalOperation
{
    private final Operation op = new Uppercase();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isIndependentOf(RelationalOperation operation)
    {
        return operation.op() instanceof Lowercase;
    }

    @Override
    public boolean subsumes(RelationalOperation operation)
    {
        Operation op = operation.op();
        return op instanceof Capitalize
               || op instanceof NCapitalize
               || op instanceof ToggleOdd
               || op instanceof ToggleEven
               || op instanceof Uppercase;
    }
}
