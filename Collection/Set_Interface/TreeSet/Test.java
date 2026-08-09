
import java.util.TreeSet;


public class Test {
    public static void main(String[] args) {
        
    /*
    A TreeSet is a collection class that stores unique elements in a sorted order. It is part of java.util package that implements the SortedSet interface, and internally uses a Red-Black tree to maintain sorting.
    Does not allow null elements because sorting is based on comparison, which may cause NullPointerException.
    Implements the NavigableSet interface and provides navigation methods like higher(), lower(), ceiling() and floor().
    It is not synchronized and can be made synchronized using Collections.synchronizedSet(). 
    */

        TreeSet<String> ts = new TreeSet<>();
        // Elements are added using add() method
        ts.add("abc");
        ts.add("xyz");
        ts.add("abc");

        System.out.println("Tree Set is " + ts);
        String check = "Geeks";

        // Check if the above string exists in the treeset
        // or not
        System.out.println("Contains " + check + " "
                           + ts.contains(check));

        // Print the first element in the TreeSet
        System.out.println("First Value " + ts.first());

        // Print the last element in the TreeSet
        System.out.println("Last Value " + ts.last());

        String val = "aaa";

        // Find the values just greater and smaller than the
        // above string
        System.out.println("Higher " + ts.higher(val));
        System.out.println("Lower " + ts.lower(val));
    }
    
}
