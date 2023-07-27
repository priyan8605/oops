package oops.interfaces;

public interface developer {
    void develop();

    default void init() {
        System.out.println("this is a default method in interface for all child");
    }
}
