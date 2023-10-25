package inner_class;

abstract class computers {

    abstract public void config();
}

public class code4 {
    public static void main(String[] args) {
        computers obj = new computers()// anonymous inner class
        {
            public void config() {
                System.out.println("accesing abstract method without creating child class ");
            }
        };
        obj.config();
    }
}
