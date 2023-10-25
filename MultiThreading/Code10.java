package MultiThreading;

class MyThread9 extends Thread {
    @Override
    public void run() {
        System.out.println("Priority of child Thread is :: " + Thread.currentThread().getPriority());
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class Code10 {
    public static void main(String[] args) {
        System.out.println("Priority of main Thread is :: " + Thread.currentThread().getPriority());
        MyThread9 t = new MyThread9();
        t.setPriority(10);// user defined priority of child Thread
        t.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }

    }
}
