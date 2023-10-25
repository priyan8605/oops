package typecasting;

class Parent {
    public void display() {
        System.out.println("parent");
    }
}

public class code3 extends Parent {
    public void display() {
        System.out.println("child");
    }

    public static void main(String[] args) {
        Parent p = new code3();
        p.display();
        code3 c = (code3) p;
        c.display();
    }

}
