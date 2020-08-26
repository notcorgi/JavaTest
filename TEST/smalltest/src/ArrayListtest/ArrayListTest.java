package ArrayListtest;
//结论：直接输出
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student li = new Student(2, 20);
        Student student = new Student(3, 30);
        list.add(li);
        list.add(student);
        System.out.println(list); // 自定义类需重写toString方法

        List<String> list1 = new ArrayList<>();
        list1.add("li");
        list1.add("liu");
        System.out.println(list1);
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        System.out.println(integers);
    }
}

class Student {
    private int name;
    private int age;

    public Student(int name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
