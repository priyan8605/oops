
class statick {
    private static int number = 5;

    public statick()// can be default or parameterised constructor
    {
        // name = naam;
        // rno = roll;
        // percent = per;
        number++;

    }

    public static int getnumber()// getter is a static function
    {
        return number;
    }

}

public class static_function {
    public static void main(String[] args) {
        statick s1 = new statick();
        System.out.println(s1.getnumber());
        statick s2 = new statick();
        System.out.println(s2.getnumber());
    }

}
