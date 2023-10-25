
class student {
    String name;
    int rno;
    double percent;

    public student(String naam, int roll, double per)// parameterised constructor
    {
        name = naam;
        rno = roll;
        percent = per;
    }
}

public class constructor {
    public static void main(String[] args) {
        student s1 = new student("rajesh", 79, 91.2);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);
    }

}
