package exceptionTest;
//自定义异常：继承编译期异常
public class TestException2 extends Exception{
    public TestException2() {
    }

    public TestException2(String message) {
        super(message);
    }
}
