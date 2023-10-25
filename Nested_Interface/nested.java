interface A {
    void show();

    public interface B {
        void msg();
    }
}

class C implements A.B {
    public void msg() {
        System.err.println("Hello nested interface B");
    }

    public void show() {
        System.out.println("Hello interface A");
    }
}

public class nested {
    public static void main(String[] args) {
        A.B obj = new C();// upcasting
        obj.msg();
        // obj.show();
        C obj2 = new C();
        obj2.show();
    }
}