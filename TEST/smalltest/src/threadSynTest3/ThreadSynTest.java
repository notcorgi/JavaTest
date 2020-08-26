package threadSynTest3;
//只创建了一个runnable对象，MyRunnable实现类中成员变量共享
public class ThreadSynTest implements Runnable{
    public int count=1;
    public Object object=new Object();
    @Override
    public  void run() {
        while (count<=99) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object) {
            System.out.println(Thread.currentThread().getName() + "--》" + count++);
            }
        }
    }
}
