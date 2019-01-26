package console;

public class CmdExit implements Command {
    @Override
    public String text() {
        return "EXIT";
    }

    @Override
    public void doCommand() {
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
