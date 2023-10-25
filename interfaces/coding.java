package interfaces;

interface IDem {
    // SRS (100% abstract)
    void m1();

    void m2();

    void m3();

    void m4();

    void m5();
}

abstract class AdapterClass implements IDem {
    // its an abstract class because method is dummy method as nothing is written
    // inside
    // the block
    public void m1() {

    };

    public void m2() {

    };

    public void m3() {

    };

    public void m4() {

    };

    public void m5() {

    };
}

class DemoImple extends AdapterClass {
    public void m3() {
        System.out.println("hey i can give the implementation");
    }
}

abstract class coding implements IDem {
    public static void main(String[] args) {

        IDem obj = new DemoImple();
        obj.m3();
    }

}
