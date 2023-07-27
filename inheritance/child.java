package oops.inheritance;

public class child extends base_child {
  double weight;

  public child()// default constructor
  {
    this.weight = -1;
  }

  public child(double l, double h, double w, double weight) {
    // super(l, h, w);// l,h,w tis value will come from parent class "base_child" h
    // re
    // it means call the parents class constructor which have 3 arguments l,h,w and
    // it
    // initializ e s the value
    this.weight = weight;
    System.out.println(super.l);
  }
}
