
// Static Keyword 
public class prog8 { 
    public static void main(String[] args) {
        Student s1=new Student("Aditi",20,101);
        Student s2=new Student("Chhavi",19,102);
        // Student.college="ABESEC"; assigned in static block

        System.out.println(s1.name+ " ,"+s1.age +","+ s1.rollNo +","+ Student.college);
        System.out.println(s2.name+ ","+ s2.age+","+s2.rollNo+ "," +Student.college);


    }
    
} 

class Student {
    String name ;
    int age ;
    int rollNo;
    static String college="ABESEC" ;
    static int grade;

Student(String name,int age,int rollNo /*String college  not allowed here*/){
    this.name=name;
    this.age=age;
    this.rollNo=rollNo;
}

// Static Block 
static{
    // college="ABESEC"; //
    grade=8;
}

}

// as the student class loads ,all the static variables or static blocks will run even before creating the object, static block always runs at first  