package MultiThreading;

class MyThread12 extends Thread {
    static Thread mt;// static variable is shared among all the object at class level,it's a global
                     // variable

    @Override
    public void run() {
        try {
            mt.join();// coz of it child thread wait for main Thread to join
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("child Thread");
        }
    }
}

public class Code13 {
    public static void main(String[] args) throws InterruptedException {
        MyThread12.mt = Thread.currentThread();
        System.out.println(MyThread12.mt);
        MyThread12 t = new MyThread12();
        t.start();
        for (int i = 1; i <= 5; i++) {
            Thread.sleep(2000);
            System.out.println("main Thread");
        }
    }
}
