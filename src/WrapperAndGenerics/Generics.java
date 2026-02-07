package WrapperAndGenerics;

public class Generics {
    public static void main(String[] args) {
   Dog<String> dog1= new Dog<>("123456");
   Dog<String> dog2= new Dog<>("123");
   Dog<String> dog3= new Dog<>("456");
        System.out.println(dog1.getid());
        System.out.println(dog2.getid());
        System.out.println(dog3.getid());
    }
}
class Dog<E>{
    E id;
    Dog(E id){
        this.id= id;
    }
    E getid(){
        return id;
    }
}
