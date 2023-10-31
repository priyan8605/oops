package MultiThreading;

//here only 1 .class file will be created
public class Class19 {
    public static void main(String[] args) {
        Runnable r = () -> { // lambda expression
                             // this body refers to run() and run() does not return any argument
            for (int i = 1; i <= 4; i++) {
                System.out.println("child thread");
            }
        };
        Thread t = new Thread(r);
        t.start();
        for (int i = 1; i <= 4; i++) {
            System.out.println("main thread");
        }
    }
}
