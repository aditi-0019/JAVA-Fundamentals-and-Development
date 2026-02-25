// This is Aditi Singh's Program Roll no:2400320100069
// Base class
class Shape {
    void area() {
        System.out.println("Calculating Area...");
    }
}
// Derived class Circle
class Circle extends Shape {
    void area() {
        double r = 5;
        System.out.println("This is Aditi Singh's code");
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }
}
// Derived class Rectangle
class Rectangle extends Shape {
    void area() {
        int l = 4, b = 6;
        System.out.println("Area of Rectangle = " + (l * b));
    }
}
// Main class
public class Area {
    public static void main(String[] args) {

        Shape s;        // reference of parent class

        s = new Circle();
        s.area();       // calls Circle area()

        s = new Rectangle();
        s.area();       // calls Rectangle area()
    }
}