package RelationalOperations;
import Operations.Operation;
import Operations.OeprationChain;

public abstract class RelationalOperation
{
    abstract Operation op();

    abstract boolean isCommutativeWith(Operation op);

    abstract Operation isNegatedBy(Operation op);

    abstract boolean doesCancel(Operation op);

    abstract boolean isUsefulFor(OeprationChain chain);
}
