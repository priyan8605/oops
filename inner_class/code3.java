package inner_class;

class computer {
    public void config() {
        System.out.println("in computer config");
    }
}

class advance_computer extends computer {
    public void config() {
        System.out.println("in advance computer config");
    }
}

public class code3 {
    public static void main(String[] args) {
        computer obj = new computer()// anonymous inner class-->this inner class do not have name
        {
            public void config() {
                System.out.println("Something new");
            }
            // it's also a way to override method
        };
        obj.config();// method overriding
    }
}
