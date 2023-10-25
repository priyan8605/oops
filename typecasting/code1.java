package typecasting;

public class code1 {
    public static void methodOne(long l) {
        System.out.println("widening");
    }

    public static void methodOne(Integer I) {
        System.out.println("Autoboxing");
    }

    public static void main(String[] args) {
        int x = 10;
        methodOne(x);// here x is primitive but in method only long is primitive and Integer is not
                     // therefore typecasting primitive one will be calles as primitive x is passed

    }
}
