package inheritance;

class animal {
    void eat() {
        System.out.println("eating\n");
    }
}

class dog extends animal {
    void bark() {
        System.out.println("barking\n");
    }
}

class babydog extends dog {
    void weep() {
        System.out.println("weeping\n");
    }
}

public class multilevel {
    public static void main(String[] args) {
        // babydog can access all properties of dog and animal
        babydog obj1 = new babydog();
        obj1.weep();
        obj1.bark();
        obj1.eat();
    }

}
