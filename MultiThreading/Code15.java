package MultiThreading;

public class Code15 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("A");
        Thread.sleep(3000);
        System.out.println("B");
        Thread.sleep(2000);
        System.out.println("C");
    }
}
