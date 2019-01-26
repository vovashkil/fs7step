package console;

public interface Command {
    String text();
    void doCommand();
    default boolean isExit() { return false; }
}
