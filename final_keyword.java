package oops;

class students {
    String name;
    int rno;
    double percent;
    final String schoolname = "jcmm";// because of final keyword school name can never be changed

}

public class final_keyword {
    public static void main(String[] args) {
        students s2 = new students();
        // s2.schoolname = "sachin";
        System.out.println(s2.schoolname);
    }

}
