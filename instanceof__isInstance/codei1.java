
package instanceof__isInstance;

import java.lang.*;
import java.io.*;
import java.util.*;

public class codei1 {
    public static void main(String[] args) throws Exception {
        codei1 t = new codei1();
        System.out.println(t instanceof codei1);// here we know from starting that t is instance
        // of code1
        try {
            System.out.println(Class.forName(args[0]).isInstance(t));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
