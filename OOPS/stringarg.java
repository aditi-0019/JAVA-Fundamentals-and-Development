// Use of string[] args
public class stringarg {
    
    public static void main(String[] args){
        System.out.println("Number of arguments are"+ args.length);
    // When the code is running then we can give some input in  the console at the runtime  so that the input gets stored in the array args and we can use it further 

        for(int i=0;i<args.length;i++){
            System.out.println("Arguement"+ i+"="+args[i]);
        }
    }
}
//  java classname is also used to write the configurations on console so thazt we can use it further eg:java Demo9classname  input.txt output.txt 

/*COnsole:
PS C:\Users\singh\OneDrive\Desktop\JAVA\OOPS> java stringarg
Number of arguments are0   [here 0 because nothing is passed and the loop is also not executed ]
PS C:\Users\singh\OneDrive\Desktop\JAVA\OOPS> java stringarg Aditi Singh Chhavi Singh
Number of arguments are4
Arguement0=Aditi
Arguement1=Singh
Arguement2=Chhavi
Arguement3=Singh
*/