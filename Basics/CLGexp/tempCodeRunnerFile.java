import java.util.Scanner;
public class ThrowThrowsDemo {
    public static void validateAge(int age) throws IllegalArgumentException{
        if(age>18){
            throw new IllegalArgumentException("Age must be  18 or above");
        }
        System.out.println("Valid age:"+age);
    }
    public static void main(String[] args){
        System.out.println("  Aditi Singh,2400320100069");
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        try{
            validateAge(age);
        }catch (IllegalArgumentException e){
          System.out.println("Vaildation failed:" + e.getMessage());
        }
    } 
}
