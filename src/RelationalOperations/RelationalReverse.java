package RelationalOperations;
import Operations.*;

public class RelationalReverse implements RelationalOperation
{
    private final Operation op = new Reverse();

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
