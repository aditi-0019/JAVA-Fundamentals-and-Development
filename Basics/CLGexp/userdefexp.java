// This is Aditi Singh's Program Roll no:2400320100069
// User defined exception
class NegativeAmountException extends Exception {
    NegativeAmountException(String msg) {
        super(msg);
    }
}
public class userdefexp {
// System.out.println("This is Aditi's Code");
    // method to check amount
    static void checkAmount(int amount) throws NegativeAmountException {
        if (amount < 0)
            throw new NegativeAmountException("Negative amount not allowed!");
        else
            System.out.println("Amount accepted: " + amount);
    }

    public static void main(String[] args) {

        try {
            checkAmount(-500);   // change value to test
        }
        catch (NegativeAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}