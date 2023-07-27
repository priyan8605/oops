package oops.interfaces;

public class webdeveloper implements developer {
    @Override
    public void develop() {
        System.out.println("i am a web developer");
    }

   public void init()
   {
    System.out.println("overiding initnmethod withchilds object");
   }
}
