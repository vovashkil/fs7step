import java.util.Scanner;

public class ApplicationConsole {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        String line;
        do {
            line = in.nextLine();
            System.out.println("> "+line);
        } while (!"EXIT".equalsIgnoreCase(line));
        System.out.println("Bye.");
    }
}
