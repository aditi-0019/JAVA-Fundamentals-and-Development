 import java.util.TreeSet;

public class FindLessThanSeven {
    public static void main(String[] args) {
        
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(3);
        numbers.add(6);
        numbers.add(8);
        numbers.add(2);
        numbers.add(7);

        // Display original set
        System.out.println("Original TreeSet: " + numbers);

        // Find numbers less than 7
        System.out.print("Numbers less than 7: ");
        for (Integer num : numbers) {
            if (num < 7) {
                System.out.print(num + " ");
            }
        }
    }
} 
    

