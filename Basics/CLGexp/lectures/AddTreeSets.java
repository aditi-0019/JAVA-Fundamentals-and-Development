import java.util.TreeSet;

public class AddTreeSets {
    public static void main(String[] args) {
        
        // Creating the  first TreeSet
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        // Creating second TreeSet
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(40);
        set2.add(50);

        // Add all elements of set1 into set2
        set2.addAll(set1);

        // Display the result
        System.out.println("Set1: " + set1);
        System.out.println("Set2 after adding Set1: " + set2);
    }
}