package oops.questions;

import oops.static_function;

public class fraction {
    public static step add(step f1, step f2)// here step add bcoz return type is step
    {
        int numerator = (f1.numerator * f2.denominator) + (f1.denominator * f2.numerator);
        int denominator = f1.denominator * f2.denominator;
        step f3 = new step(numerator, denominator);
        return f3;
    }

    public static int gcd(int numerator, int denominator) {
        int min = Math.min(numerator, denominator);// 1st minimum between
        // numerator and denominator is taken e.g 4,20--> 4 will be choosed
        // from 4 we will go to minimum possible number 1 in for loop
        for (int i = min; i >= 1; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                return i;
            }
        }
        return min;

    }

    public static class step {
        int numerator, denominator;

        public step(int numerator, int denominator) // constructor
        {
            this.numerator = numerator;
            this.denominator = denominator;
            simplify();
        }

        public void simplify() {
            int hcf = gcd(numerator, denominator);
            numerator /= hcf;
            denominator /= hcf;
            // if (numerator < denominator) {
            // if (denominator % numerator == 0) {
            // denominator = denominator / numerator;
            // numerator = 1;
            // }
        }
    }

    public static void main(String[] args) {

        step f1 = new step(35, 21);
        // f1.simplify();
        System.out.println(f1.numerator + "/" + f1.denominator);
        step f2 = new step(7, 3);
        // f2.simplify();
        System.out.println(f2.numerator + "/" + f2.denominator);
        step f3 = add(f1, f2);
        System.out.println(f3.numerator + "/" + f3.denominator);
    }

}
