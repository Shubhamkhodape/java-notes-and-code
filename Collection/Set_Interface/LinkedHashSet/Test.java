
import java.util.LinkedHashSet;


public class Test {
    public static void main(String[] args) {
        
        //LinkedHashSet is a class in Java that implements the Set interface and maintains insertion order while storing unique elements. It combines the features of a HashSet and a LinkedList.
        //Maintains insertion order of elements
        //Stores unique elements only (no duplicates)
        //Provides fast performance for basic operations
        //Default capacity = 16 and loadfactory = 0.75

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(11);
        lhs.add(11);
        lhs.add(99);
        lhs.add(8);
        lhs.add(11);
        lhs.add(11);
        lhs.add(11);

        System.out.println(lhs);
        System.out.println(lhs.remove(11));
        System.out.println(lhs);
        

    }
    
}
