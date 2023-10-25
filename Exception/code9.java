//package Exception;

import java.util.*;

class InvalidCustomerException extends Exception {
    public InvalidCustomerException(String msg) {
        super(msg);
    }
}

class Atm {
    int userid = 1212;
    int password = 1111;
    int pw;
    int uid;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to bank");
        System.out.println("Kindly enter the userid");
        uid = sc.nextInt();
        System.out.println("Kindly enter the password");
        pw = sc.nextInt();

    }

    public void verify() throws InvalidCustomerException {
        if ((userid == uid) && (password == pw)) {
            System.out.println("Take your cash");
        } else {
            // System.out.println("Are u really a card owner? because wrong data");
            InvalidCustomerException ice = new InvalidCustomerException("Are you sure? try again bcz wrong input");
            System.out.println(ice.getMessage());
            throw ice;
        }
    }
}

class Bank {
    public void initiate() {
        Atm a = new Atm();
        try {
            a.input();
            a.verify();
        } catch (InvalidCustomerException e1) {
            System.out.println("catch e1");
            try {
                a.input();
                a.verify();
            } catch (InvalidCustomerException e2) {
                System.out.println("Catch e2");
                try {
                    a.input();
                    a.verify();
                } catch (InvalidCustomerException e3) {
                    System.out.println("Catch e3");
                    try {
                        a.input();
                        a.verify();
                    } catch (InvalidCustomerException e4) {
                        System.out.println("Catch e4");
                        System.out.println("Your card is blocked");
                        System.exit(0);
                    }
                }
            }

        }
    }
}

public class code9 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.initiate();
    }

}
