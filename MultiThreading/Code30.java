
class ThreadB1 extends Thread{
    int total=0;
    @Override
    public void run()
    {
       //child thread needs lock of b only hence synchronized(this)
        synchronized(this)//object level lock (b not used in place of this coz b is not global)
        {
            System.out.println("Child thread started the calculation:-");//prints 2nd
            for(int i=1;i<=5;i++)
            {
                total=total+i;
            }
            try{
                   Thread.sleep(3000);//sleeps for 3sec
            }
            catch(InterruptedException e)
            {

            }
            System.out.println("child thread giving notification call :-");//prints third
            this.notify();//because of thread.sleep(3000) notification given after 3sec
        }
  
    }
   
}
public class Code30
{
     public static void main(String[] args) throws InterruptedException{ 
        ThreadB1 b=new ThreadB1();
        b.start();
        
        synchronized(b)//main thread(i.e t1) waits on object b(here b is like a postbox) until child thread i.e postman (t2) do not completes it's execution
        {
            System.out.println("main thread calling wait method on object b");//prints 1st
          b.wait(1000);//main thread waits for 1sec
          System.out.println("main thread received notification call");//print 4th 
             System.out.println(b.total);//print 5th
        }
     }
}