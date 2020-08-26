package Day01;

public class
TestThread {
    public static void main(String[] args) throws InterruptedException {
//        Runnable thread = new Thread1();
        Runnable thread_2 = new Thread2();
        Runnable thread_3 = new Thread3();
//        Thread thread1 = new Thread(thread);
//        Thread thread2 = new Thread(thread);
        Thread thread22 = new Thread(thread_2);
        Thread thread33 = new Thread(thread_3);
        thread22.start();
        thread33.start();
//        thread22.interrupt();
        thread22.join();
        thread33.join();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Count.sum);
    }

}

class Count {
    public static Object lock = new Object();
    public static int sum = 0;
}

class Thread1 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println(e.getStackTrace());
        }
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            synchronized (Count.lock) {
                Count.sum += 1;
            }
        }
    }
}

class Thread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            synchronized (Count.lock) {
                Count.sum -= 1;
            }
        }
    }
}


