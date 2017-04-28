package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class DeleteLast implements Operation {
    @Override
    public StringBuilder apply(StringBuilder s, StringBuilder c) {
        return new Append().undo(s, c);
    }

    @Override
    public StringBuilder undo(StringBuilder s, StringBuilder c) {
        return new Append().apply(s, c);
    }
}
