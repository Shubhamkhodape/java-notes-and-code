import java.util.*;

public class Basics {
    public static void main(String[] args){
    
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(80);
        queue.offer(30);
        queue.offer(55);
        queue.offer(91);

        System.out.println(queue);

        queue.poll();
        System.out.println(queue);
        
        System.out.println(queue.peek());

    }
    
}
