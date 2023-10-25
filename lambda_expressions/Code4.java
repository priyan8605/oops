package lambda_expressions;

@FunctionalInterface
interface Mult {
    int mult(int a);
}

public class Code4 {
    public static void main(String[] args) {
        Mult m = a -> a * 5;
        System.out.println(m.mult(5));

    }
}
