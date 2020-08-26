package threadCreateTest;
//实现接口创建多线程
public class ThreadCreateTest2 implements Runnable{

    public ThreadCreateTest2() {
    }

    @Override
    public void run() {
        int i=0;
        while (!Thread.interrupted()&&i<100){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--->"+i+++"count--->"+Count.count--);
        }
    }
}
