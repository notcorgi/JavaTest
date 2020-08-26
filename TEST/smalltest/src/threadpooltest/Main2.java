package threadpooltest;
//使用线程池创建线程
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
    public static void main(String[] args) {
        Runnable runnable=new MyRunableImp(0);
        ExecutorService es= Executors.newFixedThreadPool(2);
        es.submit(runnable);
        es.submit(runnable);
        es.shutdown();
    }
}
