package inner_class;

public class code1 {
    int num;
    A obj1 = new A();

    public void show() {
        System.out.println("in show " + num);
        obj1.config();
    }

    class A // inner class
    {
        public void config() {
            System.out.println("in config " + num);
        }
    }

    public static void main(String[] args) {
        code1 obj = new code1();
        obj.show();
    }
}
