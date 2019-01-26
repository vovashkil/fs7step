package console;

public class CmdHelp implements Command {
    @Override
    public String text() {
        return "HELP";
    }

    @Override
    public void doCommand() {
        System.out.println("Available commands are: EXIT, SHOW, BOOK, HELP");
    }
}
