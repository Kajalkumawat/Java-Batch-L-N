import java.util.*;

class A {
    int a;
    String name;

    A(int a, String name) {
        this.a = a;
        this.name = name;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        A p = new A(78, "hello");
        A o = new A(24, "bye");
        A w = new A(12, "hiii");
        A t = new A(13, "tata");
        LinkedList<A> al = new LinkedList<>();
        al.add(p);
        al.add(o);
        al.add(w);
        al.add(t);
        for (A s : al) {
            System.out.print(s.a + " " + s.name);
        }
    }
}
