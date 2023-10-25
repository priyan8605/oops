package MultiThreading;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Child thread");
        }
    }
}

public class Code4 extends MyRunnable {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        // Thread t1 = new Thread();
        // t1.run();
        Thread t2 = new Thread(r);
        // r.start(); compile time error
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread");
        }
    }

}
