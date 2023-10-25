package lambda_expressions;

@FunctionalInterface
interface Add {
    int add(int a, int b);
}

public class Code3 {
    public static void main(String[] args) {
        Add d = (a, b) -> {
            int result = a + b;
            return result;
        };
        System.out.println(d.add(10, 20));
        ;
    }
}
