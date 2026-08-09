import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {

        //USe comparator to change the priority to highest value, by default 
        //its least value
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        pq.add(99);
        pq.add(32);
        pq.add(12);
        pq.add(55);

        System.out.println(pq);
        System.out.println(pq.poll());
    }
    
}
