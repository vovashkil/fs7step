package console;

public class CmdBook implements Command {
    @Override
    public String text() {
        return "BOOK";
    }

    @Override
    public void doCommand() {
        System.out.println("Booking...");
    }
}
