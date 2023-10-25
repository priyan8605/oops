package inheritance;

public class main {
    public static void main(String[] args) {
        // base_child obj1 = new base_child();
        // System.out.println(obj1.l + " " + obj1.h + " " + obj1.w);
        // obj1 = new base_child(4, 6, 8);
        // System.out.println(obj1.l + " " + obj1.h + " " + obj1.w);
        // obj1 = new base_child(4);
        // System.out.println(obj1.l + " " + obj1.h + " " + obj1.w);
        // base_child obj2 = new base_child(obj1);// copy constructor
        // // obj1 = new base_child(4, 6, 8);
        // System.out.println(obj2.l + " " + obj2.h + " " + obj2.w);
        // child obj3 = new child();
        // System.out.println(obj3.l + " " + obj3.h + " " + obj3.w);
        child obj4 = new child(2, 3, 4, 8);
        System.out.println(obj4.l + " " + obj4.h + " " + obj4.w + " " + obj4.weight);

        // base_child obj5 = new child(2, 4, 6, 8);
        // System.out.println(obj5.w);
    }
}
