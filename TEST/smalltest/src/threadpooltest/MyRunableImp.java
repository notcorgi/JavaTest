package threadpooltest;
//在Main中只实例了一个runnable对象，MyRunnable实现类中成员变量共享
public class MyRunableImp implements Runnable {
    private int num;  //共享
    Object object=new Object();  //只在实例化时被创建一次
    public MyRunableImp(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (num<=100) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object) {
                System.out.println(Thread.currentThread().getName() + "-->" + num++);
            }
        }
    }
}
