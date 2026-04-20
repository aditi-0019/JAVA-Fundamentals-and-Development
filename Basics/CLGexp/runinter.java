// Creating threads using Runnable interface
// Aditi Singh   , Roll No:2400320100069
class MyRunnable1 implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(500); // pause for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyRunnable2 implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class runinter{
    public static void main(String[] args) {
        
        // Create Runnable objects
        MyRunnable1 obj1 = new MyRunnable1();
        MyRunnable2 obj2 = new MyRunnable2();

        // Create Thread objects
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Start threads
        t1.start();
        t2.start();
        System.out.println("This is Aditi Singh's code");
    }
}