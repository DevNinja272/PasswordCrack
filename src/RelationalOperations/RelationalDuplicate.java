package RelationalOperations;
import Operations.*;

public class RelationalDuplicate implements RelationalOperation
{
    private final Operation op = new Duplicate();

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
        return operation.op() instanceof Reverse;
    }
}
