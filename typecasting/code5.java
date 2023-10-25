package typecasting;

public class code5 {
    public static void methodOne(Object o) {
        System.out.println("Object");
    }

    public static void methodOne(Number n) {
        System.out.println("Number");
    }

    public static void main(String[] args) {
        int x = 10;
        methodOne(x);
        Long i = 10L;
    }
}
