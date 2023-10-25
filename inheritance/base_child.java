package inheritance;

public class base_child {
    double l;
    double h;
    double w;

    base_child()// constructor
    {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // calculating cube
    base_child(double side) // parameterised constructor with single argument
    {
        this.l = side;
        this.h = side;
        this.w = side;

    }

    base_child(double l, double h, double w)// parameterised constructor
    {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    base_child(base_child old)// copy constructor where old is reference variable
    {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the code");
    }
}
