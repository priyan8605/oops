package MultiThreading;

class Displays {
    public synchronized void m1()// executed by t1 thread
    {
        System.out.println(Thread.currentThread());
        for (int i = 1; i <= 4; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }

    public synchronized void m2()//executed by t2 thread
    {
        System.out.println(Thread.currentThread());
        for(int i=65;i<=69;i++)
        {
            System.out.println(i);
            try 
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {

            }
        }
    }
}

class MyThread21 extends Thread {
    Displays d;

    MyThread21(Displays d) {
        this.d = d;
    }

    @Override
    public void run() {
        d.m1();
    }
}

class MyThread22 extends Thread {
    Displays d;

    MyThread22(Displays d) {
        this.d = d;
    }

    @Override
    public void run() {
        d.m2();
    }
}

public class Code24 {
    public static void main(String[] args) {
        Displays D = new Displays();
        MyThread21 t1 = new MyThread21(D);
        MyThread22 t2 = new MyThread22(D);
        t1.start();
        t2.start();
        // at this line 3 thread : main,t1,t2
    }
}
