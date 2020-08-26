package threadpooltest;
/*
lambda表达式用于线程池,
尝试不使用外部类共享资源，把共享资源定义在Main4类中
*/
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main4 {
    public static int num=0;              //定义共享资源
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Object object = new Object();
        es.submit(() -> {
            while (num <= 100) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName() + "-->" + num++);
                }
            }
        });
        es.submit(() -> {
            while (num <= 100) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName() + "-->" + num++);
                }
            }
        });
        es.shutdown();//关闭线程池
    }
}
