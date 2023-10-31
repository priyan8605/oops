package MultiThreading;

//in this file 2 .class file will be created
class MyRunnable1 implements Runnable {
    @Override
    public void run()
  {
    for(int i=1;i<=4;i++)
    {
        System.out.println("child Thread");
    }
  }

    
}
public class Code18 {
     public static void main(String[] args){ 
    MyRunnable1 r=new MyRunnable1();
    Thread t=new Thread(r);
     t.start();
     for(int i=1;i<=4;i++)
     {
        System.out.println("Main Thread");
     }
     }
}
