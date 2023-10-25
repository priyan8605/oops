package MultiThreading;

class MyThread5 extends Thread {

}

public class Code6 {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();// calling static method "currentThread() and getName()" of the
                                                       // Thread class
        System.out.println("main() is executed by thread:: Thread-" + name);
        MyThread5 t = new MyThread5();
        System.out.println(t);
        System.out.print("name of child thread is =" + t.getName());// name of child thread
    }
}
