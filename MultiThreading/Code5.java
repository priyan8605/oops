package MultiThreading;

class MyThread4 extends Thread {
    @Override
    public void run() {
        System.out.println("run method called");
    }
}

public class Code5 {
    public static void main(String[] args) {
        MyThread4 t = new MyThread4();
        Thread t1 = new Thread(t);
        t1.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread");
        }
    }
}
