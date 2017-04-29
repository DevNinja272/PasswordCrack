import Operations.Operation;

/**
 * Created by Jinwook on 4/27/2017.
 */
public interface Relational {
    boolean isCommutativeWith(Operation op);
    Operation isNegatedBy(Operation op);
    boolean doesCancel(Operation op);
    boolean isUsefulFor(Chain chain);
}
