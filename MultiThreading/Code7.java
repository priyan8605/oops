package MultiThreading;

class MyThread6 extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.print("run() is executed by thread ::" + name);
    }
}

public class Code7 {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println("main() is executed by thre a d :: " + name);
        MyThread6 t = new MyThread6();
        t.start();
    }
}
