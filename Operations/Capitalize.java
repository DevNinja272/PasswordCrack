package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class Capitalize implements Operation {
    @Override
    public StringBuilder apply(StringBuilder s, StringBuilder c) {
        String first = "" + Character.toUpperCase(s.charAt(0));
        return s.replace(0,0, first);
    }

    @Override
    public StringBuilder undo(StringBuilder s, StringBuilder c) {
        String first = "" + Character.toLowerCase(s.charAt(0));
        return s.replace(0,0,first);
    }
}
