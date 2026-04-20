
import java.util.Scanner;

// Custom Exception Class
class InvalidInputException extends Exception {
    InvalidInputException(String message) {
        super(message);
    }
}

public class exp14b {

    // Method to validate mobile number
    static void validateMobile(String mobile) throws InvalidInputException {
        if (!mobile.matches("\\d{10}")) {
            throw new InvalidInputException("Invalid Mobile Number! Must be 10 digits.");
        }
    }

    // Method to validate email
    static void validateEmail(String email) throws InvalidInputException {
        if (!email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
            throw new InvalidInputException("Invalid Email Format!");
        }
    }

    // Method to validate username
    static void validateUsername(String username) throws InvalidInputException {
        if (username.length() < 5) {
            throw new InvalidInputException("Username must be at least 5 characters long!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is Aditi Singh's code");
        try {
            System.out.print("Enter Mobile Number: ");
            String mobile = sc.nextLine();
            validateMobile(mobile);

            System.out.print("Enter Email: ");
            String email = sc.nextLine();
            validateEmail(email);

            System.out.print("Enter Username: ");
            String username = sc.nextLine();
            validateUsername(username);

            System.out.println("\nAll inputs are valid ");

        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}