package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public class ToggleEven implements Operation {
    @Override
    public StringBuilder apply(StringBuilder s, StringBuilder c) {
        for (int i = 0; i < s.length(); i+=2)
        {
            String character = "" + Character.toUpperCase(s.charAt(i));
            s.replace(i, i, character);
        }
        return s;
    }

    @Override
    public StringBuilder undo(StringBuilder s, StringBuilder c) {
        for (int i = 0; i < s.length(); i+=2)
        {
            String character = "" + Character.toUpperCase(s.charAt(i));
            s.replace(i, i, character);
        }
        return s;
    }
}
