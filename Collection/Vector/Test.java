
import java.util.*;

public class Test {
    
    public static void main(String[] args){

        // Thread-Safe: Every individual operation is synchronized, protecting data integrity in concurrent applications.Performance 
        // Cost: Locking mechanisms introduce significant overhead, making it slower than non-synchronized equivalents.
        // Resizing Strategy: Doubles its internal memory capacity automatically by default (100% growth) whenever it overflows.
        // Traversals: Supports both modern collection iterators (Iterator, ListIterator)
        
        Vector<Integer> vec = new Vector<>();
        vec.add(12);
        vec.add(14);
        vec.add(19);

        System.out.println(vec);
        
        Iterator<Integer> iterator = vec.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        vec.remove(0);
        System.out.println(vec);

        Vector<Integer> vec1 = new Vector<>();
        vec1.add(5);

        vec.addAll(vec1);
        System.out.println(vec);
    }
}
