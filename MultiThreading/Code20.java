package MultiThreading;

public class Code20 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 4; i++) {
                    System.out.println("Child Thread");
                }
            }
        }).start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread");
        }
    }
}
