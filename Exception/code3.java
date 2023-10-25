//package Exception;

import java.util.Scanner;

class Alphas {
    void alpha() throws ArithmeticException {
        System.out.println("Connection is established");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number to divide");
            int num1 = sc.nextInt();
            System.out.println("Enter the num2");
            int num2 = sc.nextInt();
            int res = num1 / num2;
            System.out.println("The result is " + res);
        }

        catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Exception handled in alpha");
            e1.printStackTrace();
        } finally {
            System.out.println("Connection terminated");
        }

    }
}

public class code3 {
    public static void main(String[] args) {
        try {
            System.out.println("Main method connected");
            Alphas a = new Alphas();
            a.alpha();
        }

        catch (ArithmeticException e) {
            System.out.println("Exception handled in main only");
        }

    }
}
