import java.util.*;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> vs = new Vector<>();
        // capacity :by default capacity 10
        System.out.println(vs.capacity());
        // add element
        vs.addElement(12);
        vs.addElement(78);
        vs.addElement(90);
        vs.addElement(45);
        System.out.println(vs);
        System.out.println(vs.capacity());
    }
}