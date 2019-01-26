package console;

import java.util.ArrayList;
import java.util.List;

public class Commands {
    public static List<Command> all() {
        return new ArrayList<Command>() {{
            add(new CmdBook());
            add(new CmdHelp());
            add(new CmdExit());
            add(new CmdShow());
        }};
    }
}
