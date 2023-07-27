package oops.access_control;

public class A {
    private int num;// as num is private hence it can be accessed only within class A
    String name;
    int[] arr;

    public int getnum()// gets the private num and as getnum() method is public it can
    // be accessed from anywhere
    {
        return num;
    }

    public void setnum(int num)// sets private num
    {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[10];
    }
}
