public class code16 {
    static code16 c;

    public static void main(String[] args) {
        Object t = new Thread();
        System.out.println(t instanceof Object);
        System.out.println(t instanceof Thread);
        System.out.println(t instanceof Runnable);
        System.out.println(t instanceof String);
        System.out.println(null instanceof Object);
        System.out.println(c);
    }
}
