//package Exception;

public class code6 {
    public static void main(String[] args) {
        try {
            System.out.println("Inside outer try");
            try {
                System.out.println("Inside inner try");
                System.out.println(10 / 0);
            } catch (NullPointerException e) {
                System.out.println("Inside innner catch");
            }
            System.out.println("outside inner try-catch");
        }

        catch (Exception e) {
            System.out.println("Inside outer catch");
        }

        finally {
            System.out.println("Inside Outer Finally");
        }
    }
}
