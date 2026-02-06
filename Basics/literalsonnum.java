public class literalsonnum {
    
    public static void main(String [] args){
    //literals
    int num=0b101; // here b represents binary;
    System.out.println(num);

    int num1=0x7E;
    System.out.println(num1);  //here x represents the hexadecimal numbers 
     
    int num2=10_00_000 ; // we can add underscores to differentiate the numbers in java   
    System.out.println(num2);
    
    double numexp=12e10; // 12 *10 to the power 10 but in outout it will adjust itself and the result wouble be 1.2E11
    System.out.println(numexp);

    char c='a';
    c++;
    System.out.println(c);


    } 
}
