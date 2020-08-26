package threadSynTest;
//同步代码块

//通过继承Thread类创建线程
public class ThreadSynTest1 extends Thread {
    public ThreadSynTest1(String name) { //用于为线程命名
        super(name);
    }

    public ThreadSynTest1() {
    }

    public int num = 0;

    @Override
    public void run() {
        int i = 0;
        while (!isInterrupted() && i < 100) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            synchronized (Count.lock) {//同步代码块
                System.out.println(Thread.currentThread().getName() + "--->" + i++ + "Count---->" + Count.count++);
            }
        }
    }
}
