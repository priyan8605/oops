package method_hiding;

class parent {
    public static void m1() {
        System.out.println("method of hiding class");
    }
}

public class code1 extends parent {
    public static void m1() {
        System.out.println("method of child");
    }

    public static void main(String[] args) {
        parent p = new code1();
        p.m1();
    }

}
