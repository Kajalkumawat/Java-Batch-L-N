import java.util.*;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hs = new HashMap();
        hs.put(45, "hi");
        hs.put(67, "hello");
        hs.put(12, "bye");
        // foreach
        for (Map.Entry m : hs.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
