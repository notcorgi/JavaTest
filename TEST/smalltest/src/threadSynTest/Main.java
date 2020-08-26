package threadSynTest;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new ThreadSynTest1("线程1");
//        Thread thread2=new ThreadSynTest1("线程2");
        Runnable runnable=new ThreadSynTest2();
        Thread thread2=new Thread(runnable,"线程2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("count最终值---->"+ Count.count);
    }
}
