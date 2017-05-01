package RelationalOperations;
import Operations.Operation;
import Operations.OperationChain;

public interface RelationalOperation
{
    Operation op();

    boolean isIndependentOf(RelationalOperation operation);

    boolean subsumes(RelationalOperation operation);

    boolean isUsefulFor(OperationChain chain);
}
