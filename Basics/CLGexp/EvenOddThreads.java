class EvenThread extends Thread{
    public void run(){
        for(int i =2;i<=6;i++){
            System.out.println("Even:"+1);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class OddThread extends Thread{
    public void run(){
        for(int i =1;i<=5;i++){
            System.out.println("Odd"+i);
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class EvenOddThreads{
    public static void main(String args[]){
        System.out.println("Aditi Singh ,2400320100069");
        new  EvenThread().start();
        new OddThread().start();
    }
}
