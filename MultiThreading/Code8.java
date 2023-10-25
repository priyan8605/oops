package MultiThreading;

class MyThread7 extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("run() is executed by thread ::" + name);
        Thread.currentThread().setName("Pri run");
        System.out.println("name of child thread Thread-0 is changed to ::" +
                Thread.currentThread().getName());
    }
}

public class Code8 {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println("main() is executed by thread :: " + name);
        MyThread7 t = new MyThread7();
        t.start();
        Thread.currentThread().setName("Pri Thread");
        System.out.println("NAme of main Thread is changed to :: " + Thread.currentThread().getName());
    }
}
// note:- we can even give same name to 2 threads
// e.g main thread as well as Thread-0 bot can be given same name "Pri" using
// setName()