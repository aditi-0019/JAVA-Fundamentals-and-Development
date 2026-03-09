// Parameterized Constructors 
public class prog3 {
    public static void main(String[] args){
        // Student3 s1=new Student3();  [it is for default constructor]
        // for parameterized constructor we need to paas the vslue inside the class 

        Student3 s1=new Student3("Chhavi",20,102,"ABESEC");
        // output :Chhhavi,20,102 ABESEC

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.college);

        Student3 s2=new Student3();  //if we remove the default constructor from this code then this linw will give the error as already one parameterized constructor has been passed then java cannot create the default constructor by itself 
    } 
}

class Student3 {
    String name;
    int age;
    int rollNo;
    String college;
    //  Class name and constructor name should be same
    Student3() { 
        // default constructor created by java itself (output would be null, 0,0 ,null)
    }  
        /*  {
        name="Aditi";
        age=28;
        rollNo=101;
        college="ABESEC";
    } */
    


    // Parameterized constructor 
    Student3(String n,int a,int rn,String c){
        name=n;
        age=a;
        rollNo=rn;
        college=c;

    }

    void markAttendance(){
        System.out.println("Attendance marked for student "+ name);
    }
}