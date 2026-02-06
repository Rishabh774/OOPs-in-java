public class ExceptionHandling {
    public static void main(String[] args) {
        int arr[] = new int[9];
        System.out.println("Hello Rishabh ");
//       try{
//           int x =10/0;
//           System.out.println(arr[10]);
//       } catch (ArrayIndexOutOfBoundsException  e) {
//           System.out.println("Array index out of bound ");
//       } catch (ArithmeticException e) {
//           System.out.println("Divided by zero");
//       }
//
//
        try {
            int x = 10 / 0;
            System.out.println(arr[10]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException|NullPointerException e) {
            System.out.println("Handling all exceptions");
        }



        System.out.println("Hii");
    }


}
