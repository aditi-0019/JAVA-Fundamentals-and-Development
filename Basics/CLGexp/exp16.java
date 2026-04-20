// Aditi Singh  ... Roll No:2400320100069
import Mathematics.Matrix;
import java.util.Scanner;

public class exp16 {
    public static void main(String[] args) {

        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);

        System.out.println("Enter elements of Matrix 1:");
        m1.inputMatrix();

        System.out.println("Enter elements of Matrix 2:");
        m2.inputMatrix();

        Matrix sum = m1.add(m2);
        Matrix diff = m1.subtract(m2);

        System.out.println("\nAddition:");
        sum.display();

        System.out.println("\nSubtraction:");
        diff.display();
    }
}