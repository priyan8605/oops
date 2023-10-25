package static_import;

public class code1 {
    static {
        System.out.println(".class file is loading");
    }

    public static void main(String[] args) {

        System.out.println(Math.sqrt(100));
        System.out.println(Math.max(100, 50));
        System.out.println(Math.random());
    }
}
