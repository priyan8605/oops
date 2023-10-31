package MultiThreading;

class Display {
    public void wish(String name) {
        for (int i = 1; i <= 4; i++) {
            System.out.print("Good Morning:");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
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
        Display d = new Display();// Display object created
        MyThread19 t1 = new MyThread19(d, "sachin");
        t1.start();
    }

}
