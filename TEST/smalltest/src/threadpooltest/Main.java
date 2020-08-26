package threadpooltest;
//正常创建线程测试
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable=new MyRunableImp(0);
        Thread thread1=new Thread(runnable,"线程1");
        Thread thread2=new Thread(runnable,"线程2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
