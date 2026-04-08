// Constructor chaining includes the calling the next larger constructors 
public class prog5 {

    public static void main(String[] args) {
        Student5 s1=new Student5();
        Student5 s2=new Student5("Aditi"); //only one value would be printed as given and the rest will be assigned by the default values 
        Student5 s3=new Student5("Chhavi",20);  //2 values will be printed and the rest will be assigned by the default values 
        Student5 s4=new Student5("Rohan",25,117); // 3 values would be called and the rest one would be assigned by the default values
        Student5 s5=new Student5("Yash",16,123,"BVV");  //no default values would be defined 
     
       System.out.println(s5.College);  //BVV
       System.out.println(s2.name);     //Aditi
       System.out.println(s1.name);      //Unknown
       System.out.println(s4.rollNum);  //117


     }
}
    
class Student5{
    String name;
    int age;
    int rollNum;
    String College;
     

    // Each constructor is calling the next larger constructor and eventually it will end up being at the largest constructor
    Student5() {
    
        this("Unknown");// this line should be the first line in the constructor else it would give errors
        System.out.println("I'm in first constructor"); // this line would be written after this
    } 

    Student5(String name)  {
     
        this(name,0); 
        System.out.println("I'm in second constructor");

    }
    Student5(String name ,int age){
      
         this(name,age,0);
         System.out.println("I'm in third constructor");
    }
    Student5(String name ,int age,int rollNum){
    
        this(name,age,rollNum,"Unknown");
        System.out.println("I'm in fourth constructor");
    }
 
    Student5(String name ,int age,int rollNum,String College){
        this.name=name;
        this.age=age;
        this.rollNum=rollNum;
        this.College=College;
        System.out.println("I'm in fifth constructor");
    }

  void markAttendance(){
    System.out.println("Attendance marked for student"+ name);
  }
 } 

// OUTPUT 
/*
I'm in fifth constructor
I'm in fourth constructor
I'm in third constructor
I'm in second constructor
I'm in first constructor
I'm in fifth constructor
I'm in fourth constructor
I'm in third constructor
I'm in second constructor
I'm in fifth constructor
I'm in fourth constructor
I'm in third constructor
I'm in fifth constructor
I'm in fourth constructor
I'm in fifth constructor
BVV
Aditi
Unknown
117

*/
//  Can we call a Constructor manually ? Ans: NO
