
//import Exception;
import java.io.*;

public class code14 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);
            new BufferedReader(new FileReader("sample.txt"));
        } catch (ArithmeticException | NullPointerException | IOException e) {
            // handling the code
            e.printStackTrace();
        }
    }
}
