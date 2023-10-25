package interfaces;

interface Isample {
    // 100% abstract class
    // by default m1 and m2 are public and abstract method
    void m1();

    void m2();
}

class sampleI implements Isample {
    @Override
    public void m1()// writing public is must coz abstract method is public by default
    {
        System.out.println("hey implementation is given to m1 ");
    }

    @Override
    public void m2()// writing public is must coz abstract method is public by default
    {
        System.out.println("hey implementation is given to m2 ");
    }
}

public class TestApp {
    public static void main(String[] args) {
        Isample sample = new sampleI();// upcasting
        sample.m1();// method overriding
        sample.m2();// method overriding
    }
}
