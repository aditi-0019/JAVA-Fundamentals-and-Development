package functions;
public class chaining {

    public static void main(String[] args ){
    // Chaining of functions   
        fun1();

        System.out.println("bye");

    }
    
     static void fun1(){
        fun2();
        System.out.println("Hiii");
     }

     static void fun2(){
        fun3();
        System.out.println("Hello");
     } 

     static void fun3(){
        System.out.println("How are you");
     }
}
/* Output 
How are you
Hello
Hiii
bye

*/