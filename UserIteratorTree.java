import java.util.*;

class A {
    int a;
    String name;

    A(int a, String name) {
        this.a = a;
        this.name = name;
    }
}

public class UserIteratorTree {
    public static void main(String[] args) {
        // class cast exception :when make userdefine wrapper in treeset then give class
        // cast exception :you should use comparable interface
        A p = new A(45, "hello");
        TreeSet<A> ts = new TreeSet<>();
        ts.add(p);
        for (A l : ts) {
            System.out.println(l.a + " " + l.name);
        }
    }
}
