public class firstprog {
    public static void main(String[] args){
        // Functions in JAVA
        greet(); //Hello
        sayHello("Aditi");  //HelloAditi //here we can pass the arguement
        /* int x=getNumber() ;
        System.out.println(x); //10
         */
        // System.out.println(getNumber());//10
        // getNumber(); no output will be printed here it will be lost 

        System.out.println(multiply(2,4)); //8
    }
    
    // No Input ,No Output
    static void greet(){    //void as no return is there 
        System.out.println("Hello");
        // return;
    }

    static void sayHello(String name){     //Number of parameters can be anything
        System.out.println("Hello" +name);
    }

    // No input but Output 
    static int getNumber(){
        return 10;
    }
     //Input ,Output 
     static int multiply(int a,int b){
        return (a*b);
     }     
}
