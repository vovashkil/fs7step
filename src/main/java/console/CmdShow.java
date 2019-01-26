package console;

public class CmdShow implements Command {
    @Override
    public String text() {
        return "SHOW";
    }

    @Override
    public void doCommand() {
        System.out.println("Show...");
    }
}
