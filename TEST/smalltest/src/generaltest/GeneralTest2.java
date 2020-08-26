package generaltest;
//测试泛型方法
public class GeneralTest2 {
    public <I> I print(I i) {
        System.out.println(i);
        return i;
    }

    public static <I> I printf(I i) {
        System.out.println(i);
        return i;
    }
}
