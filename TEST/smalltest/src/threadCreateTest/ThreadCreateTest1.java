package threadCreateTest;
//通过继承Thread类创建线程
public class ThreadCreateTest1 extends Thread{
    public ThreadCreateTest1(String name) { //用于为线程命名
        super(name);
    }

    public ThreadCreateTest1() {
    }

    @Override
    public void run() {
        int i=0;
        while (!isInterrupted()&&i<100){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--->"+i+++"count---->"+Count.count++);
        }
    }
}
