package inner_class;
//when inner class is static outer class can not be static

class A // outer class
{
    // B obj = new B();

    public void show() {
        System.out.println("in show");
        // obj.config();
        // object "obj" of class B(innner class) will call config mwthod of class B with
        // the help of method of class A
    }

    class B {
        public void config() {
            System.out.println("in config");
        }
    }
}

public class code2 {
    public static void main(String[] args) {
        A obj1 = new A();
        // obj1.show();
        A.B obj2;// used to acces metohd of static inner class
        obj2 = obj1.new B();
        obj2.config();
    }

}
