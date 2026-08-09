
import java.util.*;

public class Test{
    public static void main(String[] args){

        Deque<Integer> a = new ArrayDeque<>();
        //LILO
        a.add(11);
        a.add(22);
        a.add(34);
        a.add(12);
        System.out.println(a);

        a.push(122);
        System.out.println(a);

        a.pop();
        System.out.println(a);

        System.out.println(a.peek());

        System.out.println(a.peekLast());

        System.out.println(a.getFirst());

        System.out.println(a.getLast());
        
    }
}