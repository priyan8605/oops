package MultiThreading;

class MyThread extends Thread {
    @Override
    public void run()// required for assigning job to a thread
    {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("Child Thread");

        }
    }

}

public class Code1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
