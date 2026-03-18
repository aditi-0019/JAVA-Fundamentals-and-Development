// CALL BY REFERENCE--> There is no call by reference in java
public class prog7 {
    public static void main(String[] args){
        Random r1=new Random(4,5);
        Random r2=new Random(r1); //new object will be created and will  have the same values as of r1

        System.out.println(r1.x+ " , " +r1.y); //4 ,5

        addTen(r1);
        System.out.println(r1.x+ " , " +r1.y);  //14,15

        addTen(r2);
       System.out.println(r2.x + " , " + r2.y);  //14,15
    } 
       
     
    static void addTen(Random r){
        r.x =r.x+10;
        r.y=r.y+10; 

        // non primitive data type and return type is also allowed 
    }
}

class Random{
    int x ;
    int y;

    Random(int x ,int y){
        this.x=x;
        this.y=y;
    }

    Random(Random r){
        this.x =r.x;
        this.y=r.y;
    }
}