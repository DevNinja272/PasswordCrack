package RelationalOperations;
import Operations.*;

public class RelationalPrepend implements RelationalOperation
{
    // TODO: Expansion - prepend.reflect == reflect.append.prepend, s.pre.ncap == s.upp.pre, toggle

    private final Operation op = new Prepend();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isIndependentOf(RelationalOperation operation)
    {
        // TODO: Prepend-depends on if same char, Uppercase, Lowercase
        Operation op = operation.op();
        return op instanceof Append || op instanceof DeleteLast;
    }

    @Override
    public RelationalOperation isNegatedBy(RelationalOperation operation)
    {
        return (operation.op() instanceof Reverse) ? new RelationalAppend() : null;
    }

    @Override
    public boolean subsumes(RelationalOperation operation)
    {
        return operation.op() instanceof DeleteFirst;
    }

    @Override
    public boolean isUsefulFor(OperationChain chain)
    {
        return true;
    }
}
