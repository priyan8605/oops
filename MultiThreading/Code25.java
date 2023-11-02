package MultiThreading;

class Display1 {
    public void wish(String name) {
        System.out.println(Thread.currentThread() + "ram");
        System.out.println(Thread.currentThread() + "shyam");
        System.out.println(Thread.currentThread() + "raj");

        synchronized (this)// whichever thread gets lock of current object that only can access it
        {
            System.out.println(Thread.currentThread());
            for (int i = 1; i <= 4; i++) {
                System.out.println("Good Morning");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println(name);
            }
            System.out.println(Thread.currentThread() + "rakesh");
            System.out.println(Thread.currentThread() + "raushan");
            System.out.println(Thread.currentThread() + "rohan");
        }
    }
}

class MyThread23 extends Thread {
    Display1 d;
    String name;

    MyThread23(Display1 d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}

public class Code25 {
    public static void main(String[] args) {
        Display1 D = new Display1();
        MyThread23 t1 = new MyThread23(D, "dhoni");
        MyThread23 t2 = new MyThread23(D, "virat");
        t1.start();
        t2.start();
    }

}
