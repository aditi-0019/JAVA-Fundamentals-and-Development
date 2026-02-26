public class palindromecheck {

    public static void main(String[] args) {
        System.out.println("This is Aditi Singh's Program");
        // Check if argument is given
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        int num = Integer.parseInt(args[0]);
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome Number.");
        } else {
            System.out.println(original + " is not a Palindrome Number.");
        }
    }
}
