package Collection_Framework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{
    int Roll_no;

    public Student(int roll_no, String name) {
        Roll_no = roll_no;
        this.name = name;
    }

    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Roll_no == student.Roll_no;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Roll_no);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Roll_no=" + Roll_no +
                ", name='" + name + '\'' +
                '}';
    }
}
public class HASHSET_OF_CUSTOM_OBJECTS {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
//        Student s1 = new Student(1,"Rishabh");
//        Student s2 = new Student(2,"Saurabh");
//        Student s3 = new Student(3,"Suryansh");
//        Student s4 = new Student(1,"Dogesh");\
        set.add(new Student(1,"Rishabh"));
        set.add(new Student(2,"Saurabh"));
        set.add(new Student(3,"Suryansh"));
        set.add(new Student(1,"Rishabh"));

        System.out.println(set);

    }
}
