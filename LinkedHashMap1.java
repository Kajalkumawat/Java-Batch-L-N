import java.util.*;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(null, "hello");
        lhm.put(1, "hiii");
        lhm.put(2, "hello");
        lhm.put(3, "heeeeeee");
        System.out.println(lhm);
        lhm.put(1, "byeeeeee");
        System.out.println(lhm);
    }
}
