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
        return false;
    }

    @Override
    public boolean subsumes(RelationalOperation operation)
    {
        Operation op = operation.op();
        return op instanceof ToggleOdd || op instanceof NCapitalize;
    }
}
