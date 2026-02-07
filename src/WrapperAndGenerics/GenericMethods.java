package WrapperAndGenerics;

public class GenericMethods {
    public static void main(String[] args) {
        printData("Hello");
        printData(123);
        GenericMethods obj = new GenericMethods();
        // obj.doubledata("abc");
       obj.doubledata(123);
    }
    static <E> void printData(E data ){
        System.out.println(data);
    }
//    <E> void doubledata(E data){
//        System.out.println(data);
//    }

    // Example of bounded generics
    <E extends Number > void doubledata(E data){
        System.out.println(data);
    }
}
