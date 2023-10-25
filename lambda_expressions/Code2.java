package lambda_expressions;

interface cod {
    void disp();

    void disp2();
}

public class Code2 {  
    public static void main(String[] args) throws Exception {
        cod d = new cod() {
            public void disp() {
                System.out.println("Hello java learners");
            }

            public void disp2() {
                System.out.println("All goood");
            }
        };
        d.disp();
        d.disp2();
    }
}