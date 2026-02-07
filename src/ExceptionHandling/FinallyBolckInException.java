package ExceptionHandling;

public class FinallyBolckInException {
    public static void main(String[] args) {
      //  int arr[]= new int[5];
//        try{
//            System.out.println(arr[9]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(" Array Index Out Of Bounds exception");
//        } finally {
//            System.out.println("Exception handled ");
//        }
//        System.out.println("Hello world");


        // throws keyword
        int arr[]= new int[10];
        try {
            getelement(arr);
        } catch (Exception e) {
            System.out.println("Arithmetic exception "+ e.getMessage());
        }

    }
    static  int getelement (int arr[]) throws ArithmeticException{
        return arr[15];
    }
}
