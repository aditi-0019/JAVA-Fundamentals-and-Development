import java.util.Scanner;

public class Student {

    private int rollNo;
    private String name;
    private String course;
    private double marks;

    public Student(int rollNo, String name, String course, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    public void display() {
        System.out.println("\n===== Student Details =====");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);
        System.out.println("Marks   : " + marks);
        System.out.println("===========================\n");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**** STUDENT RECORD SYSTEM ****");
        System.out.println("Program coded by Aditi\n");

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student s1 = new Student(roll, name, course, marks);
        s1.display();

        sc.close();
    }
}

