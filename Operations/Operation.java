package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public interface Operation {
    StringBuilder apply(StringBuilder s, StringBuilder c);
    StringBuilder undo(StringBuilder s, StringBuilder c);
}
