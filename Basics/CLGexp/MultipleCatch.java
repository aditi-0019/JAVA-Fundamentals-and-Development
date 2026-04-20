public class MultipleCatch {
    public static void main(String args[]){
        System.out.println("Aditi ,2400320100069");
        try{
            int [] arr = {10,20,30};
            System.out.println("Elemnets"+arr[5]);
            int result = 10/0;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException: " + e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Exception"+e.getMessage());
        }catch(Exception e){
            System.out.println("General Exception" + e.getMessage());
        }finally{
            System.out.println("Finally block executed");
        }
    }
}


