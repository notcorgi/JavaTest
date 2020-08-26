package threadSynTest2;
//使用同步锁

//实现接口创建多线程
public class ThreadSynTest2 implements Runnable {

    public ThreadSynTest2() {
    }

    @Override
    public void run() {
        int i = 0;
        while (!Thread.interrupted() && i < 100) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Count.lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + "--->" + i++ + "Count---->" + Count.count--);//写进try发生异常也可开锁
            } finally {
                Count.lock.unlock();//发生异常也可开锁
            }
        }
    }
}
