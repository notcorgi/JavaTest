package threadpooltest;
/*使用匿名内部类和线程池
由于匿名内部类一般只用在只使用一次的实现类中，书写后发现若使用匿名内部类，则每次都需要实例化一个实现Runnable接口的对象，
 导致资源不能共享，共享资源只能写在Main方法中,写在Main后发现只能fina变量内部类才能使用，故不能num++，暂无法实现。
 最终使用外部类静态变量作为共享资源
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main3 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Object object = new Object();
        es.submit(new Runnable() {
            @Override
            public void run() {
                while (Count.num <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (object) {
                        System.out.println(Thread.currentThread().getName() + "-->" + Count.num++);
                    }
                }
            }
        });
        es.submit(new Runnable() {

            @Override
            public void run() {
                while (Count.num <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (object) {
                        System.out.println(Thread.currentThread().getName() + "-->" + Count.num++);
                    }
                }
            }
        });
        es.shutdown();

    }
}
