package exceptionTest;
//自定义异常 ：继承运行期异常测试
public class
TestException1 extends RuntimeException{
    public TestException1() {
    }

    public TestException1(String message) {
        super(message);
    }
}
