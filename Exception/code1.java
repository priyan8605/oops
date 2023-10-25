//package Exception;

import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        System.out.println("Connection is established");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number to divide");
            int num1 = sc.nextInt();
            System.out.println("Enter the num2");
            int num2 = sc.nextInt();
            int res = num1 / num2;
            System.out.println("The result is " + res);
            System.out.println("Enter size of an array");
            int size = sc.nextInt();
            int[] a = new int[size];
            System.out.println("Enter element of an array");
            int ele = sc.nextInt();
            System.out.println("Enter position at which element to be inserted");
            int pos = sc.nextInt();
            a[pos] = ele;
            System.out.println("Element " + ele + " inserted at" + pos + " succesfully");

        } catch (ArithmeticException e1) {
            System.out.println("Please provide non-zero denominator");
        } catch (NegativeArraySizeException e2) {
            System.out.println("Give positive size of array");
        } catch (ArrayIndexOutOfBoundsException e3) {
            System.out.println("index of array should be 0 to size-1");
        } catch (Exception e)// generic catch block
        {
            System.out.println("Wrong input !");
        }
        ;
        System.out.println("Connection is terminated");
    }
}
