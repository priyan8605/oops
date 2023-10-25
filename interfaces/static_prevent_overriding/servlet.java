package interfaces.static_prevent_overriding;

//import oops.static_function;

public interface servlet {
    static public void init() {
        System.out.println("servelet is initializing");
    }

    void service();

    default public void destroy() {
        System.out.println("Servlet is destroying");
    }
}

class myservlet implements servlet {

    public void init() {
        System.out.println("creating my servlet object");
    }

    public void service() {
        System.out.println("my servlet service method");
    }

    public void destroy() {
        System.out.println("destroying my servlet");
    }

    public static void main(String[] args) {
        servlet obj1 = new myservlet();
        // obj1.init(); error because static method of interface cannot be overriden
        obj1.destroy();

        myservlet obj2 = new myservlet();
        obj2.init();
        // servlet obj3 = new servlet(); // can't create object of servlet bcoz its
        // interface
        servlet.init();
    }
}
