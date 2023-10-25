package interfaces;

class sample {
    public void m1() {
        System.out.println("method of sample");
    }
}

interface IDemo {
    void m2();
}

class DemoImpl extends sample implements IDemo {
    @Override
    public void m2() {
        System.err.println("accesing abstract method of interface class by method Overriding  ");
    }

    public void m1() {
        System.out.println("Omverriding  method of sample class ");
    }
}

public class extend_implement {
    public static void main(String[] args) {
        IDemo obj1 = new DemoImpl(); // creating object from the derived class using upcasting
        obj1.m2();
        sample obj2 = new DemoImpl();
        obj2.m1();

    }
}
