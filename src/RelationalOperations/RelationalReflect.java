package RelationalOperations;
import Operations.*;

public class RelationalReflect extends RelationalOperation
{
    private final Operation op = new Reflect();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isCommutativeWith(Operation op)
    {
        return op instanceof Uppercase || op instanceof Lowercase || op instanceof ToggleEven;
    }

    @Override
    public Operation isNegatedBy(Operation op)
    {
        return null;
    }

    @Override
    public boolean doesCancel(Operation op)
    {
        return false;
    }

    @Override
    public boolean isUsefulFor(OeprationChain chain)
    {
        return true;
    }
}
