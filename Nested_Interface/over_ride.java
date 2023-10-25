class DB_Driver {

    public void getDriver() {
        System.out.println("Type-1-Driver");
    }
}

class New_DB_Driver extends DB_Driver {

    // public void getdriver() {
    // System.out.println("Type 4 driver");
    // } shows error because method name have small d instead of capital D
    @Override
    public void getDriver() {
        System.out.println("Type 4 driver");
    }
}

public class over_ride {
    public static void main(String[] args) {
        DB_Driver obj1 = new New_DB_Driver();// upcasting
        obj1.getDriver();// method overriding

    }
}
