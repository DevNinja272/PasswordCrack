package RelationalOperations;
import Operations.*;

public class RelationalAppend extends RelationalOperation
{
    private final Operation op = new Append();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isCommutativeWith(Operation op)
    {
        return op instanceof Prepend || op instanceof DeleteFirst || op instanceof Capitalize;
    }

    @Override
    public Operation isNegatedBy(Operation op)
    {
        return (op instanceof Reverse) ? new Prepend() : null;
    }

    @Override
    public boolean doesCancel(Operation op)
    {
        // TODO: Uppercase, Lowercase, Capitalize, nCapitalize, Toggle (even and odd)
        return op instanceof DeleteLast;
    }

    @Override
    public boolean isUsefulFor(OeprationChain chain)
    {
        return true;
    }
}
