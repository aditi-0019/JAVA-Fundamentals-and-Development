public class casting {
    public static void main(String[] args) {
        byte b=125;
        int a=b;  //implicit typecasting
        System.out.println(a);

        int p=257;
        byte k=(byte)p;  // output 1 as modulo 257 is out of the of int and this is explicit type of conversion 
        System.out.println(k);
       
        byte m=30;
        byte n=10;
        int result=m*n; //here java will promote the value
        System.out.println(result);
    
    }
    
}
