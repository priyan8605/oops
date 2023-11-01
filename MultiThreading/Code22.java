package MultiThreading;

class Display {
    public synchronized void wish(String name) {
        for (int i = 1; i <= 4; i++) {
            // System.out.println(Thread.currentThread());
            System.out.print("Good Morning:");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
            // System.out.println(Thread.currentThread());
            System.out.println(name);
        }
    }
}

class MyThread19 extends Thread {
    Display d;// notes just a reference not a Display object
    String name;

    MyThread19(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}

public class Code22 {
    public static void main(String[] args) {
        Display D1 = new Display();// Display object created
        Display D2 = new Display();
        MyThread19 t1 = new MyThread19(D1, "sachin");
        MyThread19 t2 = new MyThread19(D2, "dhoni");
        t1.start();
        t2.start();
    }

}
