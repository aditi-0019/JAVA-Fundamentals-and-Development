// This is Aditi Singh Program  Roll no:2400320100069
class Person {
    String name = "Aditi";
    int age = 20;

    void display() {
        System.out.println("This is Aditi Singh's Code");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int roll = 101;
    String course = "B.Tech CSE";

    void show() {
        display(); // inherited method
        System.out.println("Roll No: " + roll);
        System.out.println("Course: " + course);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}