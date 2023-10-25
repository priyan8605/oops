package typecasting;

class Student {
    static {
        System.out.println("Student .class file is loading");
    }

    public Student() {
        System.out.println("Constructor is being called");
    }
}

public class Coding extends Student {
    public static void main(String[] args) throws Exception {
        // taking input of the class name for which object has to be created at the
        // run_time
        String Student = args[0];
        // Load the classfile expilicitly
        Class cl = Class.forName(Student);
        // for the loaded class object is created using zero parameter or default
        // constructor
        // loaded class must have default constructor
        Object obj = cl.newInstance();
        // Object obj = Class.forName(args[0]).newInstance();

        // performing explicit typecasting
        Student std = (Student) obj;
        System.out.println(std);
    }

}
