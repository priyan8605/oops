package MultiThreading;

public class Code19 {
    public static void main(String[] args) {
        Runnable r = new Runnable()// note here we are not creating a Runnable object instead
                                   // object of a class is created which implements Runnable and reference is of
                                   // "r" type
        {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Child thread");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        for (int i = 1; i <= 3; i++) {
            System.out.println("MAIN THREAD");
        }
    }
}
//here 2 .class file is created=> 1>code19.class   2>code19$.class