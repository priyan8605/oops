package MultiThreading;

class MyThread8 extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread");
    }
}

public class Code9 {
    public static void main(String[] args) {
        //String na m e=Thread.currentThread().getName(
        // Thread.currentThread().setName("pri main");
        System.out.println(10 / 0);
        // compile time error--> Exception in thread "main"
        // java.lang.ArithmeticException: / by zero
        // here "main" is not method name its name of thread

    }
}
