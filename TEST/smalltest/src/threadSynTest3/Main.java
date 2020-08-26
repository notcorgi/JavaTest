package threadSynTest3;

import threadSynTest.ThreadSynTest2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable=new ThreadSynTest();   //只创建了一个runnable对象，MyRunnable实现类中成员变量共享
        Thread thread1=new Thread(runnable,"线程1");//只是分别调用run方法
        Thread thread2=new Thread(runnable,"线程2");//只是分别调用run方法
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
