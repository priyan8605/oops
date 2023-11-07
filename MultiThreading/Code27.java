class ThreadB extends Thread{
    int total=0;
    @Override
    public void run()
    {
       //child thread needs lock of b only hence synchronized(this)
        synchronized(this)//object level lock (b not used in place of this coz b is not global)
        {
            System.out.println("Child thread started the calculation");//prints 2nd
            for(int i=1;i<=5;i++)
            {
                total=total+i;
            }
            System.out.println("child thread giving notification call :-");//prints third
            this.notify();//"this" shows the current object ThreadB here this.notify is a notification
            //to waiting main thread hence here child thread may or may not releases lock immediately
            //therefore main thread goes into one more another waiting state to get the lock
        }
    }
}
public class Code27
{
     public static void main(String[] args) throws InterruptedException{ 
        ThreadB b=new ThreadB();
        b.start();
        //at this line child thread(i.e t2) and main thread(i.e t1) and both have same priority i.e 5
        //jb tkk child thread b object pr notify nhi krta i.e letter nhi daalta tb tkk main or t1 thread will wait
        //by default priority is given to main thread 
        //bcoz of synchronized(b) object level lock is applied so now owner of b is main thread
        synchronized(b)//main thread(i.e t1) waits on object b(here b is like a postbox) until child thread i.e postman (t2) do not completes it's execution
        {
            System.out.println("main thread calling wait method on object b");//prints 1st
          b.wait();//here main thread goes into waiting state hence object b lock is released bcoz b lock is also required by child thread
          //now child thread gets lock hence go to child thread
          System.out.println("main thread received notification call");//print 4th 
             System.out.println(b.total);//print 5th
        }
     }
}