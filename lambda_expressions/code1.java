package lambda_expressions;

@FunctionalInterface
interface Demo {
    void disp();
}

public class code1 {
    public static void main(String[] args) {
        Demo d = () -> {
            System.out.println("HEllo LEarners");
        };
        d.disp();
    }
}
