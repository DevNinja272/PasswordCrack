package Operations;

/**
 * Created by Jinwook on 4/27/2017.
 */
public interface Operation
{
    void apply(StringBuilder s, StringBuilder c);

    void undo(StringBuilder s);
}
