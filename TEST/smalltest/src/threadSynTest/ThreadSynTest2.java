package threadSynTest;
//同步代码块


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
            synchronized (Count.lock) {//同步代码块
                System.out.println(Thread.currentThread().getName() + "--->" + i++ + "count--->" + Count.count--);
            }
        }
    }
}
