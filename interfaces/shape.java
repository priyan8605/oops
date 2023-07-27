package oops.interfaces;

public interface shape {
    public static final int i = 34;

    public abstract void calculatearea(int r);
}

class circle implements shape {
    public void calculatearea(int r) {
        System.out.println("Area of circle is " + (Math.PI * r * r));
    }

    public static void main(String[] args) {
        shape s1 = new circle();// upcasting for method overriding
        s1.calculatearea(2);
    }
}
