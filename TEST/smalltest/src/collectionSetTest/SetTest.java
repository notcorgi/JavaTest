package collectionSetTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//set底层原理，重写hashcode,重写equals方法
public class SetTest {
    public static void main(String[] args) {
        Set<Student> students= new HashSet<>();
        students.add(new Student("li",20));
        students.add(new Student("lui",20));
        students.add(new Student("wang",21));
        students.add(new Student("li",20));
        System.out.println(students);


    }
}
