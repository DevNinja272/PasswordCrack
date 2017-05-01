package RelationalOperations;
import Operations.*;

public class RelationalAppend implements RelationalOperation
{
    private final Operation op = new Append();

    @Override
    public Operation op()
    {
        return this.op;
    }

    @Override
    public boolean isIndependentOf(RelationalOperation operation)
    {
        Operation op = operation.op();
        return op instanceof Prepend || op instanceof DeleteFirst || op instanceof Capitalize;
    }

    @Override
    public boolean subsumes(RelationalOperation operation)
    {
        // TODO: Uppercase, Lowercase, Capitalize, nCapitalize, Toggle (even and odd)
        return operation.op() instanceof DeleteLast;
    }

    @Override
    public boolean isUsefulFor(OperationChain chain)
    {
        return true;
    }
}
