import console.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class ApplicationConsole {
    public static void main(String[] args) {
        ArrayList<Command> commands = new ArrayList<Command>() {{
            add(new CmdBook());
            add(new CmdHelp());
            add(new CmdExit());
            add(new CmdShow());
        }};
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        Optional<Command> cmd;
        do {
            String line = in.nextLine().trim();
            cmd = commands
                    .stream().filter(command -> command.text().equalsIgnoreCase(line))
                    .findFirst();
            cmd.ifPresent(Command::doCommand);
            System.out.println("> "+cmd.get().text());
        } while (!cmd.get().isExit());
        System.out.println("Bye.");
    }
}
