package polymorphism;

public class main {
    public static void main(String[] args) {
        // shapes obj1 = new shapes();

        // circle obj2 = new circle();
        // square obj3 = new square();

        // obj1.area();
        // obj2.area();
        // obj3.area();
        shapes obj = new square();// upcasting
        obj.area();
    }
}
