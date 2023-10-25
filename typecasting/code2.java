package typecasting;

public class code2 {
    public static void methodOne(long l) {
        System.out.println("widening");
    }

    public static void methodOne(int... i) {
        System.out.println("Var-arg method");
    }

    public static void main(String... arg) {
        int x = 10;
        methodOne(x);
    }
}
