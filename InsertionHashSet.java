import java.util.*;

public class InsertionHashSet {
    public static void main(String[] args) {
        HashSet hs2 = new HashSet<>();
        hs2.add(67);
        hs2.add("hii");
        System.out.println(hs2);
        // duplicate insertion not possible with proof
        System.out.println(hs2.add(67));// false
        // method work on boolean type
    }
}
