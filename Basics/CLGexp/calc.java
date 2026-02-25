// Demonstration of Compile-Time Polymorphism using Method Overloading
// This is Aditi Singh's Program
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    float add(float a, float b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    float add(float a, float b, float c) {
        return a + b + c;
    }
}
public class calc {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println("This is Aditi Singh's code");
        System.out.println("Sum of two integers: " + calc.add(10, 20));
        System.out.println("Sum of two floats: " + calc.add(5.5f, 4.5f));
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));
        System.out.println("Sum of three float value: " + calc.add(12.5f, 2.5f, 1.1f));
    }
}
