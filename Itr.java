import java.util.*;

public class Itr {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        Iterator ir = hs.iterator();
        while (ir.hasNext()) {
            System.out.print(ir.next() + " ");
        }
    }
}
