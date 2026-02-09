package Collection_Framework;
//|         Feature            | Comparable   | Comparator               |
//        | ------------------ | ------------ | ------------------------ |
//        | Package            | java.lang    | java.util                |
//        | Method             | compareTo()  | compare()                |
//        | Implemented in     | Same class   | Separate class           |
//        | Sorting type       | Natural      | Custom                   |
//        | Collections.sort() | `sort(list)` | `sort(list, comparator)` |

public class Animal implements Comparable<Animal>{
    int age;
    String name;
    int weight;

    public Animal(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Animal that) {
        return this.age-that.age;
    }
}
