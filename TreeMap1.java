import java.util.*;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        // null not allow due to null pointer exception
        tm.put(8, 1);
        tm.put(2, 78);
        tm.put(1, 98);
        tm.put(4, 34);
        System.out.println(tm);
    }
}