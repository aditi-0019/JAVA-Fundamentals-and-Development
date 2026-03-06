// This is Aditi Singh's Program Roll no:2400320100069
class D extends Thread
{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("From D:-"+i);
        }
        System.out.println("Exit from D");
    }
}
class B extends Thread
{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("From B:-"+i);
        }
        System.out.println("Exit from B");
    }
}
class C extends Thread
{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("From C:-"+i);
        }
        System.out.println("Exit from C");
    }
}
public class ThreadDemoRun{
    public static void main(String args[]){
        new D().run();
        new B().run();
        new C().run();
    }

}
