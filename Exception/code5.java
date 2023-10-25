//package Exception;

class Demo1 {
    void disp() {
        try {
            System.out.println("Method Started");
            System.exit(0);
            System.out.println("just checking");
        } finally {
            System.out.println("Method hiding");
        }

    }
}

public class code5 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.disp();
    }
}
