import Operations.Operation;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class AppendRelation implements Relational{
    @Override
    public boolean isCommutativeWith(Operation op) {
        return false;
    }
}
