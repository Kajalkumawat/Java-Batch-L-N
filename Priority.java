import java.util.*;

public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        pq.add(67);
        pq.add(16);
        pq.add(78);
        System.out.println(pq);
        // iterator
        Iterator<Integer> itr = pq.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
