public class casting {
    public static void main(String[] args) {
        byte b=125;
        int a=b;  //implicit typecasting
        System.out.println(a); //125

        int p=257;
        byte k=(byte)p;  // output 1 as modulo 257 is out of the of int and this is explicit type of conversion 
        // FORMULA: NUM%(Range of the data type to which we are converting)  here range of byte is -128 to 127 which is 256 ie 2^8

        System.out.println(k); //1
        

        //Automatic TYPE PROMOTONS [byte->int]
        byte m=30;
        byte n=10;
        int result=m*n; //here java will promote the value
        System.out.println(result); //300  
        // error case  
        byte s=50;
        // s=s*2;
        // System.out.println(s);   //  error  
        System.out.println((byte) (s*2)); //100

        /*   Rules for TYPE PROMOTIONS 
         1. byte,short and char values will be promoted to int 
         2. If one operand is long, then te whole exp will become long 
         3. If one operand is float,then entire exp will become float
         4. If one operand is double then the whole exp will become double
    
        */ 
        //  char to int 
        char c='a';
        int i; 
        i=c;
        System.out.println(i); //97

        // Truncating conversion 
        float f= 15.678f;
        int r;
        r=(int)f;
        System.out.println(r);  //15 

        // Boolean to any data type conversion is not possible 
    
    }
    
}
