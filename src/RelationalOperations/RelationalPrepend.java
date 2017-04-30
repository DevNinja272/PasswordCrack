package RelationalOperations;
import Operations.*;

public class RelationalPrepend extends RelationalOperation
{
    // TODO: Expansion - prepend.reflect == reflect.append.prepend, s.pre.ncap == s.upp.pre, toggle

    private final Operation op = new Prepend();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isCommutativeWith(Operation op)
    {
        // TODO: Prepend-depends on if same char, Uppercase, Lowercase
        return op instanceof Append || op instanceof DeleteLast;
    }

    @Override
    public Operation isNegatedBy(Operation op)
    {
        return (op instanceof Reverse) ? new Append() : null;
    }

    @Override
    public boolean doesCancel(Operation op)
    {
        return op instanceof DeleteFirst;
    }

    @Override
    public boolean isUsefulFor(OeprationChain chain)
    {
        return true;
    }
}
