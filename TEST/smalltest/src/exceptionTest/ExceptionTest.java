package exceptionTest;

public class
ExceptionTest {
    public static void main(String[] args) {
        int[] array = null;
        try {
            choose(array, 2);
        } catch (TestException2 e) {
            e.printStackTrace();
            System.out.println("=========");
            System.out.println(e.getMessage());
            System.out.println("=========");
            System.out.println(e);
        }
        System.out.println("finish");
    }

    public static void choose(int[] a, int index) throws TestException2 {
        if (a == null) {
            throw new TestException2("运行期异常测试");//运行期异常，故无需处理
        }
        if (index < 0 || index >= a.length) {
            throw new TestException1("测试编译器异常测试");//编译期异常 需要throws或try catch处理
        }
    }

}
