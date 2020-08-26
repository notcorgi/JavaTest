package threadCreateTest;
//创建线程类
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new ThreadCreateTest1("线程1");    //创建继承类线程
        thread1.start();
        thread1.join();//等待线程1运行后再运行main线程和线程2
        System.out.println("==============");
        Runnable runnable=new ThreadCreateTest2();  //实例化实现接口对象
        Thread thread2=new Thread(runnable,"线程2");//创建线程
        thread2.start();
    }
}
