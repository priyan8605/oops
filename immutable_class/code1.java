package immutable_class;

public class code1 {
    int i;

    code1(int i) {
        this.i = i;
    }

    public code1 modify(int i) {
        if (this.i == 1) {
            // as this.i==i therefore we will return the current object
            return this;
        } else {
            // as this.i!=i therfore create a new object with the data whatever is given by
            // them
            // and return that object
            return new code1(i);
        }
    }

    public static void main(String[] args) {
        code1 t1 = new code1(10);// t1 pointing 1st object
        code1 t2 = t1.modify(10);// t2 also pointing 1st object
        code1 t3 = t1.modify(100);// t3 pointing to 2nd new object
        code1 t4 = t1.modify(100);
        System.out.println(t1 = t2);
        System.out.println(t1 = t3);
        System.out.println(t2 = t3);
        System.out.println(t3 = t4);
    }
}
