//CALL BY VALUE
public class prog6 {
    public static void main(String[] args){
        int x=4;
        int y=5;
        System.out.println(x+ " , " +y); //4,5
         
        addTen(x,y);
        System.out.println(x+ " , " +y); //4,5
    }

    static void addTen(int x,int y){
        x=x+10;
        y=y+10;
    }
}
