class ThreadB1 extends Thread
{
    int total=0;
    public void run()
    {
        System.out.println("child thread execution start");
         for(int i=1;i<=100;i++)
         {
            total+=i;
         }
       //  System.out.println("total="+i);
    }
}
public class Code28
{
     public static void main(String[] args)throws InterruptedException
     { 
       ThreadB1 b=new ThreadB1();
       b.start();
       System.out.println("No of active threads are:: "+Thread.activeCount());
       //2 threads here main and thread-0
    b.join();//main thread goes to waaiting state until thread-0 donot complete execution and joins main thread
  
       System.out.println("main thread gets executed"+b.total);

     }
}