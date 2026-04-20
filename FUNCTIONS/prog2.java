


public class prog2 {
    public static void main(String[] args){
    // Function Overloading 

    int x=sum(2,3);
    System.out.println(x);   //5

    int y=sum(5,6);
    System.out.println(y);  //11

    int z=sum(3,5,6);
    System.out.println(z);  //14
    
    greet("Aditi" ,20 );
    greet(19, "Chhavi");

    fun();
    }
    
    static int sum(int a,int b){
        return (a+b);
    }

    /*  if the two functions are doing the same thing then they can have 
     the same name provided they should have 
     1. different number of arguments (parameters)
     2. different type of parameters (data type different) 
     3. Ordering of parameters */
     
    static int sum(int a,int b,int c){   //different numbers of parameters 
        return (a+b+c);
    }
   
    static int sum(double a,double b){   //different type of parameters 
        return (int)(a+b);
    }

    static void greet(String name, int age ){
        System.out.println("Hi" + name + ".  Your age is "+ age);
    }
    static void greet(int age ,String name){
        System.out.println("Hi" + name + ". Your age is "+ age);

    }
    static void fun(){
        System.out.println("Heyyy");
    } 
    /*If  We are trying to give two functions same name on the basis of return type 
      then it will throw an compiler error 
       */
    static int fun2(){
        System.out.println("Heyyy");
        return 5;  

    }
}
