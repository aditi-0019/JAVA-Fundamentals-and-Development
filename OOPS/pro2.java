public class pro2 {
    public static void main(String[] args){

    Student1 s1=new Student1() ;
    s1.name="Aditi";
    s1.age=20;
    s1.rollNo=101;
    s1.College="ABESEC";
   
    // Constructors :To create an object

    // Default values  
    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.rollNo);
    System.out.println(s1.College);
    // (bina define kiye ye null 0 0 null output dega )

     /* 
     System.out.println(x) output : the local variales x has not been initialised  */
    }
    
}


// Local variables don't have default values whereas instance variables have 
  /* Default values 
  Integer -->0
  floating-->0.0
  Boolean -->false 
  String -->null(nothing)
  
  */

class Student1{
    String name ;  //information/data/charactersistics--> instance variables (they have default values ) 
    int age;
    int rollNo;
    String College;
     

    void markAttendance(){ //behaviours --->functions --->instance methods 
        System.out.println("Attendance marked for student"+ name);

    }


}