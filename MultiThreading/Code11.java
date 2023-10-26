package MultiThreading;

// public static final int MIN_PRIORITY;
//   public static final int NORM_PRIORITY;
//   public static final int MAX_PRIORITY;
class MyThread10 extends Thread {

    @Override
    public void run() {
        System.out.println("child thread priority=" + Thread.currentThread().getPriority());
        for (int i = 1; i <= 5; i++) {
            Thread.yield();
            System.out.println("Child Thread");
         
        }
    }
}

public class Code11 {
    public static void main(String[] args) {
        System.out.println("main thread priority=" + Thread.currentThread().getPriority());
        MyThread10 t = new MyThread10();
        t.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("main Thread");
        }
    }
}
