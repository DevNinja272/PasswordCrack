package RelationalOperations;
import Operations.*;

public class RelationalNCapitalize extends RelationalOperation
{
    private final Operation op = new NCapitalize();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isCommutativeWith(Operation op)
    {
        return op instanceof Uppercase
               || op instanceof Lowercase
               || op instanceof ToggleEven
               || op instanceof ToggleOdd;
    }

    @Override
    public Operation isNegatedBy(Operation op)
    {
        return null;
    }

    @Override
    public boolean doesCancel(Operation op)
    {
        return op instanceof NCapitalize;
    }

    @Override
    public boolean isUsefulFor(OeprationChain chain)
    {
        return true;
    }
}
