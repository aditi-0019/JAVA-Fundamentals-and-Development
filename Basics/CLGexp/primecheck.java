public class primecheck {

    public static void main(String[] args) {
         System.out.println("This is Aditi Singh's Program");
        // Check if argument is passed
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        int num = Integer.parseInt(args[0]);
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
    }
}
