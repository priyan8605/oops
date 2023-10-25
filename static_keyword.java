
class studen {
    String name;
    int rno;
    double percent;
    private static int numberofstudents = 5;

    public int getnumberofstudent() // getter
    {
        return numberofstudents;
    }

    public studen(String naam, int roll, double per)// parameterised constructor
    {
        name = naam;
        rno = roll;
        percent = per;
        numberofstudents++;

    }
}

public class static_keyword {
    public static void main(String[] args) {

        // System.out.println(studen.numberofstudents);
        studen s1 = new studen("ram", 15, 99.9);
        System.out.println(s1.getnumberofstudent());
        studen s2 = new studen("raj", 17, 55.6);
        System.out.println(s2.getnumberofstudent());

    }
}
