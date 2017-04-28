package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class Duplicate implements Operation {

    int size = 0;

    @Override
    public StringBuilder apply(StringBuilder s, StringBuilder c) {
        size = s.length();
        return s.append(s);
    }

    @Override
    public StringBuilder undo(StringBuilder s, StringBuilder c) {
        return s.delete(size, s.length());
    }
}
