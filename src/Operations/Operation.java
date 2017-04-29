package Operations;

public interface Operation
{
    void apply(StringBuilder s, StringBuilder c);
    void undo(StringBuilder s);
}
