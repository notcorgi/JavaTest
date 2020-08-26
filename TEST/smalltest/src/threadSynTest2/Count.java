package threadSynTest2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//用于两个线程之间共享变量
public class Count {
    public static Lock lock=new ReentrantLock();
    public static int count=0;
}

