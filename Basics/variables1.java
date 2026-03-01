public class variables1 {
    public static void main(String []args){
        int num1=9;
        byte by=127;
        short sh=358;
        long l=7865;

        float f=5.87f;  //single precision 
        double d=8.5;  //double precision
        double a=6.022e23;
        System.out.println(a); //avagado no 
        char c='a';

        boolean bool= 3>5;
        System.out.println(num1); //9
        System.out.println( by); //127
        System.out.println(l); //7865
        System.out.println(f);//5.87
        System.out.println(d); //8.5
        System.out.println(c); //a
        System.out.println(bool); //false 
        System.out.println(sh); //358

        // Representing the numbers into binary,octal and hexadecimal format 
        byte b=0b101;
        System.out.println(b);  //0b is symbol for binary 
        byte O=06 ;// range of octal is 0-7 in byte if we furtherwant to declare 8 then we have to use int and 0 is used to denote octal 
        System.out.println(O); //6
        byte h=0x7 ;//range 0-15 and symbol is 0x and rep=-->0-9,A,B,C,D,E,F
        System.out.println(h);  // 7 

        // We can apply underscores (_) in declaration of long,float ,and double but keep in mind that we cannot put it just before and after the decimal(.) point and exp  (e)
    }
    
}
