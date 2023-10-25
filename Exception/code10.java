//package Exception;

import java.util.*;

class UnderAgeException extends Exception {
    public UnderAgeException(String msg) {
        super(msg);
    }
}

class OverAgeException extends Exception {
    public OverAgeException(String msg) {
        super(msg);
    }
}

class Applicant {
    int age;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();
    }

    public void verify() throws Exception // UnderAgeException, OverAgeException
    {
        if (age < 18) {
            UnderAgeException uae = new UnderAgeException("Age is below 18");
            System.out.println(uae.getMessage());
            throw uae;
        } else if (age > 60) {
            OverAgeException oae = new OverAgeException("Age is above 60");
            System.out.println(oae.getMessage());
            throw oae;
        } else {
            System.out.println("Yoy are eligible");
        }
    }
}

class Rto {
    public void initiate() {
        Applicant a = new Applicant();
        try {
            a.input();
            a.verify();
        } catch (Exception e1)// (UnderAgeException | OverAgeException e1)
        {
            System.out.println("Catch e1");
            try {
                a.input();
                a.verify();
            } catch (Exception e2)// (UnderAgeException | OverAgeException e2)
            {
                System.out.println("Catch e2");
                try {
                    a.input();
                    a.verify();
                } catch (Exception e3)// (UnderAgeException | OverAgeException e3)
                {
                    System.out.println("Catch e3");
                    System.out.println("Don't ever try again read rules");
                    System.exit(0);
                }
            }
        }
    }
}

public class code10 {
    public static void main(String[] args) {
        Rto r = new Rto();
        r.initiate();
    }
}
