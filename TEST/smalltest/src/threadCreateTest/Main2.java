package threadCreateTest;
//测试interupt
public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new ThreadCreateTest1("线程1");
        Runnable runnable=new ThreadCreateTest2();
        Thread thread2=new Thread(runnable,"线程2");
        thread1.start();
        thread2.start();
        thread1.interrupt();

    }
}
