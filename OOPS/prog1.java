public class prog1 {
    public static void main(String[] args){
        Student s1=new Student() ;
        Student s2=new Student();

        s1.name="Aditi";
        s1.age=20;
        s1.rollNo=101;
        s1.College="ABESEC";

        s2.name="Chhavi";
        s2.age=19;
        s2.rollNo=102;
        s2.College="ABESEC";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();
    }
    
}
class Student {
    String name;
    int age ;
    int rollNo;
    String College ;


    void markAttendance() {
        System.out.println("Attendance marked by "+ name) ;

    } 
    void print(){
        System.out.println(name + ","+ age +","+ rollNo +","+ College);
    }

}

