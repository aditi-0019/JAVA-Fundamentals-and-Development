import java.util.Scanner;
public class jaggedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is Aditi Singh's Program");
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Creating jagged array
        int[][] arr = new int[rows][];

        // Taking input for each row with different column size
        for(int i = 0; i < rows; i++) {

            System.out.print("Enter number of columns for row " + i + ": ");
            int cols = sc.nextInt();

            arr[i] = new int[cols];

            System.out.println("Enter elements for row " + i + ": ");
            for(int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing the jagged array
        System.out.println("Jagged Array Elements:");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
