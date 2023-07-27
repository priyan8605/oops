package oops.abstracts;

abstract public class abstract_class {

   public void calculate() {
      System.out.println("result calculating");
   }

   abstract public void launch();
}

class execute {
   public static void main(String[] args) {
      main obj = new main();
      obj.launch();
      obj.calculate();
      abstract_class obj2 = new main();
      obj2.launch();
   }
}