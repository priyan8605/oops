package MultiThreading;

class Railway {

    public void searchTicket() {
        System.out.println("your Ticket is booked :");
    }

    public synchronized void bookTicket(String name) {
        System.out.println(name);
    }

}

class MyThread20 extends Thread {
    Railway r;
    String name;

    MyThread20(Railway r, String name) {
        this.r = r;
        this.name = name;
    }

    @Override
    public void run() {
        r.searchTicket();
        r.bookTicket(name);
    }
}

public class Code23 {
    public static void main(String[] args) {
        Railway R = new Railway();
        MyThread20 t1 = new MyThread20(R, "Dhoni");
        MyThread20 t2 = new MyThread20(R, "sachin");
        t1.start();
        t2.start();
    }
}
