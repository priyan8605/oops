package MultiThreading;

class MyThread15 extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("child thread= " + i + "  is sleeping");
                Thread.sleep(3000);

            }
        } catch (InterruptedException e) {
            System.out.println("i got interruptd");
        }
    }
}

public class Code16 {
    public static void main(String[] args) {
        MyThread15 t = new MyThread15();
        t.start();
        t.interrupt();// main thread is interrupting the child thread
        System.out.println(("end of main Thread"));
    }
}
