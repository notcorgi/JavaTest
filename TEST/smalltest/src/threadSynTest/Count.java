package threadSynTest;
//用于两个线程之间共享变量
public class Count {
    public static Object lock = new Object();
    public static int count=0;
}

