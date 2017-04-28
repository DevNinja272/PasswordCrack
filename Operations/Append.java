package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class Append implements Operation {
    @Override
    public StringBuilder apply(StringBuilder s, StringBuilder c) {
        return s.append(c);
    }

    @Override
    public StringBuilder undo(StringBuilder s, StringBuilder c) {
        return s.deleteCharAt(s.length() -  1);
    }
}
