import java.util.*;

public class HashList {
    public static void main(String[] args) {
        // hashset add hashset
        HashSet<String> hs = new HashSet<>();
        hs.add("khushi");
        hs.add("kajal");
        hs.add("vishal");
        HashSet<String> hs1 = new HashSet<>(hs);
        hs1.add("aarush");
        hs1.add("akshay");
        hs1.add("ankit");
        // iterator :
        Iterator itr = hs1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

    }
}
