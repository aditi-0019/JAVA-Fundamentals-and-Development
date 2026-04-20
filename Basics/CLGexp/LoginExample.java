
import java.io.Console;
public class LoginExample {
    public static void main(String[] args) {
        // Get Console object
        Console console = System.console();
        // Check if console is available
        if (console == null) {
 System.out.println("Console is not available. Run this program in a terminal.");
            return;
        }
        System.out.println("This is Aditi Singh's code");
// Read username
        String username = console.readLine("Enter Username: ");
        // Read password (hidden input)
        char[] passwordArray = console.readPassword("Enter Password: ");
        // Convert char[] to String
        String password = new String(passwordArray);
        // Display entered details
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
