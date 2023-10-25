//package Exception;

import java.util.Scanner;

class Alpha {
    void alpha() throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number to divide");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2");
        int num2 = sc.nextInt();
        int res = num1 / num2;
        System.out.println("The result is " + res);
    }
}

class Beta {
    void beta() {
        Alpha a = new Alpha();
        a.alpha();
    }
}

public class code2 {
    public static void main(String[] args) {
        try {
            Beta b = new Beta();
            b.beta();
        } catch (ArithmeticException e) {
            System.out.println("exception finally handled");
        }
    }

}
