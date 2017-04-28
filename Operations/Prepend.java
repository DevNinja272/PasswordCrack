package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class Prepend implements Operation {
    @Override
    public StringBuilder apply(StringBuilder s, StringBuilder c) {
        return s.insert(0, c);
    }

    @Override
    public StringBuilder undo(StringBuilder s, StringBuilder c) {
        return s.deleteCharAt(0);
    }
}
