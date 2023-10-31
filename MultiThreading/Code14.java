package MultiThreading;

class MyThread13 extends Thread {
    @Override
    public void run() {
        System.out.println("child thread priority=" + Thread.currentThread().getPriority());
        for (int i = 1; i <= 5; i++) {
            Thread.yield();
            System.out.println("Child Thread");

        }
    }
}

public class Code14 {
    public static void main(String[] args) throws InterruptedException{ 
         Thread.currentThread().join();
     }
}
