package MultiThreading;

public class Code21 {
     public static void main(String[] args){ 
        new Thread(()->
        {
            for(int i=1;i<=4;i++)
            {
                System.out.println("child thread");
            }
        }).start();
        for(int i=1;i<=4;i++)
        {
            System.out.println("main thread");
        }
     }
}
