package MultiThreading;

class MyThread3 extends Thread {
   @Override
   public void start() {
      super.start();
      System.out.println("Start method called");
   }

   @Override
   public void run() {
      System.out.println("no arg run method");
   }
}

public class Code3 {
   public static void main(String[] args) {
      MyThread3 t = new MyThread3();
      t.start();

   }
}
