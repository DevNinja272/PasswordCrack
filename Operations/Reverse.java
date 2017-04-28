package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class Reverse implements Operation {
    @Override
    public StringBuilder apply(StringBuilder s, StringBuilder c) {
        return s.reverse();
    }

    @Override
    public StringBuilder undo(StringBuilder s, StringBuilder c) {
        return s.reverse();
    }
}
