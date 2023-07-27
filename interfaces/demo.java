package oops.interfaces;

public class demo {
    public static void main(String[] args) {
        developer obj1 = new webdeveloper();// upcasting
        developer obj2 = new iosdeveloper();// upcasting
        developer obj3 = new androiddeveloper();// upcasting
        obj1.develop();
        obj2.develop();
        obj3.develop();
        obj1.init();
        obj2.init();
        obj3.init();
    }
}
