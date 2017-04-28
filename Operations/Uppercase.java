package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class Uppercase implements Operation {
    @Override
    public StringBuilder apply(StringBuilder s, StringBuilder c) {
        String uppercase = s.toString().toUpperCase();
        return s.replace(0, s.length(), uppercase);
    }

    @Override
    public StringBuilder undo(StringBuilder s, StringBuilder c) {
        String lowercase = s.toString().toLowerCase();
        return s.replace(0, s.length(), lowercase);
    }
}
