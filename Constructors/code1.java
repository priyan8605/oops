package Constructors;

class parent {
    parent() {
        System.out.println("parent class constructor");
    }
}

class child extends parent {
    child() {
        System.out.println("child class constructor");
    }
}

public class code1 {
    public static void main(String[] args) {
        child c = new child();

    }

}
