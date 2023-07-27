package oops.inheritance;

public class copy_constructor {
    String name;

    public copy_constructor(String name) {
        this.name = name;
    }

    public copy_constructor(copy_constructor copies)// copy constructor where copies
    // is a reference variable
    {
        this.name = copies.name;
    }

    public static void main(String[] args) {
        copy_constructor obj1=new copy_constructor("happy");
        copy_constructor obj2=new copy_constructor(obj1);
        System.out.println(obj2.name);
    }
}
