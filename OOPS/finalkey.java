//Usage of Final Key 
public class finalkey {
    
    public static void  main(String[] args ) {
        Random r1=new Random();
        System.out.println(r1.PI);

        final int x;
        x=4;
        System.out.println(x); 

        // print(); gives  error as it cannot makes the static  reference to the non static member
    }
    //static void  print(){

    }


/* Why main method is static in JAVA ?
  Java executes the main functions's code ..if it was not static then JVM  has to 
  create an object main and to call it would have to use .main
 Finalkey f=new Finalkey() ;
 f.main();
 Finalkey.main()

*/

class Random{
     static final double PI; // we can assign the value here too
     //the  value of PI=3.14 will be same in every object of the random class   [constant and same for static final]
     static {
        PI=3.14;  
     }

    // Random(){
    //     this.PI=3.14; 
    // } not allowed as we are using the static final here so we cant assign it in a constructor as it is the class's variable not of objects 
}