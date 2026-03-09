package collection;

//import java.util.Collection;
import java.util.PriorityQueue;

//Priority Queue 
public class LaunchFirst {
    public static void main(String... args) {
        PriorityQueue<Object> pq = new PriorityQueue<>();
        pq.add(100);
        pq.add(10);
        pq.add(12);
        pq.add(1221);
        pq.add("pq");
        IO.print(pq);
    }

}
// Black red algo