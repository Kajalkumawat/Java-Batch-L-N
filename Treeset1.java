import java.util.*;

public class Treeset1 {
    public static void main(String[] args) {
        Set ts = new TreeSet<>();
        ts.add(3);
        ts.add(1);
        ts.add(5);
        ts.add(2);
        System.out.println(ts);

        Collection cs = new TreeSet<>();
        cs.add(23);
        cs.add(77);
        System.out.println(cs);

        TreeSet ts1 = new TreeSet<>();
        ts1.add(45);
        ts1.add(57);
        System.out.println(ts1);

        // sortedset and naviagle set it does not implement directly it always used
        // comparater internface and comparable interface read in future

    }
}
