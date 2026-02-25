// This is Aditi Singh's Program Roll No 2400320100069
// First interface
interface A {
    void showA();
}

// Second interface
interface B {
    void showB();
}

// Class implementing multiple interfaces
class Demo implements A, B {

    public void showA() { 
        System.out.println("This is Aditi SIngh's code");
        System.out.println("Interface A method");
    }

    public void showB() {
        System.out.println("Interface B method");
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {

        Demo d = new Demo();
        d.showA();
        d.showB();
    }
}
