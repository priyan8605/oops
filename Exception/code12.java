//package Exception;

import java.util.Scanner;

public class code12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Hello");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
