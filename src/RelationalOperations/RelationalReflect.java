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
        return operation.op() instanceof Reflect;
    }

    @Override
    public boolean subsumes(RelationalOperation operation)
    {
        return false;
    }
}
