//package Exception;

class Demo {
    int disp() {
        try {
            System.out.println("Method Started");
            return 10;
        } finally {
            System.out.println("Method Ending");
        }

    }
}

public class code4 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.disp();

    }
}
