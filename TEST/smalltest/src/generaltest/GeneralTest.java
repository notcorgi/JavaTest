package generaltest;
//测试泛型类
public class GeneralTest <T>{
    private String name;
    private int age;
    private T gender; //变量也可以是泛型
    public GeneralTest() {
    }

    public GeneralTest(String name, int age, T gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public T getGender() {
        return gender;
    }

    public void setGender(T gender) {
        this.gender = gender;
    }
}
