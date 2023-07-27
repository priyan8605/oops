package oops.interfaces.static_prevent_overriding;

public class hiding {
    public static void hide() {
        System.out.println("method of hiding class");
    }

}

class child extends hiding {
    public static void hide() {
        System.out.println("method of child");
    }

    public static void main(String[] args) {
        // method hiding
        hiding d1 = new child();
        d1.hide();
        child d2 = new child();
        d2.hide();

    }
}
