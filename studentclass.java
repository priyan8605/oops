package oops;

class student {
    public String name;
    int rno;
    double percent;

    public student(String naam, int roll, double per) {
        name = naam;
        rno = roll;
        rno = roll;

    }

    public int getrollno()// getter
    {
        // even roll no is private then also no error is shown herein same
        // class we can use private member but we can't use dot operator to acces rno
        // with the help of object as it is a private member
        return rno;
    }

    public void setrno(int rno)// setter
    {
        this.rno = rno;

    }

}

public class studentclass {

    // public static void change(student s)// s is object and student is class
    // {
    // s.name = "rohan";
    // }

    public static void main(String[] args) {
        // student s1 = new student();
        // s1.name = "raghav";

        // s1.percent = 92.1;
        // // s1.rno = 76;// error bcoz rno is private member of student class
        // // here no erroe is shown even when getrollno() return rno
        // // hence with the help of dot operator we can access function as well
        // attributes
        // // of
        // // class(rn0,name,percent)
        // s1.setrno(96);
        // System.out.println(s1.getrollno());// private rno has been set due to setter
        // function
        student s1 = new student("raj", 79, 92.1);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);
    }

}
