import java.io.*;

class Parent {
    public void m1() throws Throwable {
        
            System.out.println("Method of parent");
        
    }
}

// class Child extends Parent {
// public void m1() throws Exceptio
// System.out.println("Method of child");
// }
// }

public class code15 extends Parent {
    public void m1() throws IOException {
        System.out.println("Method of child");

    }

    public static void main(String[] args) throws Exception {
        Parent p = new code15();
        try {
            p.m1();
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
