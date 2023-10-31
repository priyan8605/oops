package MultiThreading;

class MyThread11 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("sita thread");
            try {
                Thread.sleep(2000);// pauses the execution for 2sec (1sec=1000milisecond)
            } catch (InterruptedException e) {

            }
        }
    }
}

public class Code12 {
    public static void main(String[] args) throws InterruptedException {
        MyThread11 t = new MyThread11();
        t.start();
        t.join(1000, 10000);// ram thread will wait until sita thread donot joins ram thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("ram thread");
        }
    }
}
