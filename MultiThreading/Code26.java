
class Displayes1 {
    public void wish(String name) {
        System.out.println(Thread.currentThread() + "ram");
        System.out.println(Thread.currentThread() + "shyam");
        System.out.println(Thread.currentThread() + "raj");

        synchronized (Displayes1.class)// whichever thread gets lock of current object that only can access it
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

class MyThread24 extends Thread {
    Displayes1 d;
    String name;

    MyThread24(Displayes1 d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}

public class Code26
{
     public static void main(String[] args){ 
        Displayes1 D1 = new Displayes1();
        Displayes1 D2 = new Displayes1();
        MyThread24 t1 = new MyThread24(D1, "dhoni");
        MyThread24 t2 = new MyThread24(D2, "virat");
        t1.start();
        t2.start();
     }
}