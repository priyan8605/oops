package MultiThreading;

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("No arg run method");
        // run(5);
    }

    public void run(int i) {
        System.out.println("int arg run method");
    }
}

public class Code2 {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.start();
        t.run(5);
        // task of main method
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
