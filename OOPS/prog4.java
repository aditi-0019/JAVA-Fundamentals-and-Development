// Chaining of Constructors  and constructor overloading 
//  There are two methods of constructor overloading 1. Calling the biggest constructor by the smaller constructors and 2. Calling the next larger constructor as comp to the costructor which is calling 
public class prog4 {
     public static void main (String [] args){ 
        // to call an constructor 
        // Student4 s1=new Student4("Aditi ",20); to call a conatructor having two values 
       

        Student4 s1=new Student4();
        Student4 s2=new Student4("Aditi"); //only one value would be printed as given and the rest will be assigned by the default values 
        Student4 s3=new Student4("Chhavi",20);  //2 values will be printed and the rest will be assigned by the default values 
        Student4 s4=new Student4("Rohan",25,117); // 3 values would be called and the rest one would be assigned by the default values
        Student4 s5=new Student4("Yash",16,123,"BVV");  //no default values would be defined 
     
       System.out.println(s1.College);  //Unknown
       System.out.println(s3.name);     //Chhavi
       System.out.println(s4.age);      //25
       System.out.println(s5.rollNum);  //123


     }
}
 class Student4{
    String name;
    int age;
    int rollNum;
    String College;

    Student4() {
        /* if were willing to pass some values in the default constructor 
          we are using "Unknown" in spite of null here  */
        
       /*  this.name="Unknown";
        this.age=0;
        this.rollNum=0;
        this.College="Unknown";  
        */
        // To reduce the above codes(line) we can also write it as 
        this("Unknown",0,0,"Unknown");
    } 

    Student4(String name)  {
        // this.name=name;
        // we can call the biggest constructor by passing the parameters into this , it would help us to reduce the code 
        this(name,0,0,"Unknown");  //the biggest construct0r is called 

    }
    Student4(String name ,int age){
       /* this.name=name;
        this.age=age;b*/

         this(name,age,0,"Unknown");
    }
    Student4(String name ,int age,int rollNum){
        /*this.name=name;
        this.age=age;
        this.rollNum=rollNum;
        */
        this(name,age,rollNum,"Unknown");
    }
    // In above we have chained the constructors ..but the output would be same in both the cases... we're  getting the output by the last constructor where all the parameters is passed 
    Student4(String name ,int age,int rollNum,String College){
        this.name=name;
        this.age=age;
        this.rollNum=rollNum;
        this.College=College;
    }

  void markAttendance(){
    System.out.println("Attendance marked for student"+ name);
  }
 } 
