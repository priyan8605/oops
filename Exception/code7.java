//package Exception;

public class code7 {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try execute");
            try {
                System.out.println("Inner try execute");

            } catch (NullPointerException e) {
                System.out.println("Inner catch execute");
                int ans = 10 / 0;
            } finally {
                System.out.println("Inner Finally execute");
            }
            System.out.println("checking the exception 1");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch execute");
        } finally {
            System.out.println("Outer finally execute");
        }
        System.out.println("Checking the exception 2");
    }
}
