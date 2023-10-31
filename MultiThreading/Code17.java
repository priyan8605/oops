package MultiThreading;

class MyThread16 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("child Thread");

        }
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("I got interrupted");
            e.printStackTrace();
        }
    }
}

public class Code17 {
    public static void main(String[] args) {
        MyThread16 t = new MyThread16();
        t.start();
        t.interrupt();// main thread is interrupting child thread
        System.out.println("end of main Thread");
    }
}
