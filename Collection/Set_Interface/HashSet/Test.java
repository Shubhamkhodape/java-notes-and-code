
import java.util.*;


public class Test {

    public static void main(String[] args) {
        //HashSet uses HashMap internally to store data in the form of Key-Value pair.
        //Elements are stored using hashing technique, therefore elements are not stored in an ordered fashion and the elements will be returned in random order.
        //Elements are stored in the form of key-value pair (internally by HashMap) where key will the actual element value and value will be the present Constant.
        //This class permits at most one null element because HashMap allows only one null key.
        //HashSet has default initial capacity of 16.
        //HashSet has default load factor of 0.75 or 75%.
        //HashSet does not have any method(like get(key) in HashMap) to retrieve the object directly.
        //The only way to retrieve objects from the HashSet is through iterating the entire HashSet. This can be achieved by using iterator, for, for-each ,etc.
        
        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(25);
        set.add(78);
        set.add(43);
        set.add(11);

        System.out.println(set);

        Set<Integer> s= new HashSet<>();
        s.add(55);
        set.addAll(s);
        System.out.println(set);

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println(set.remove(11));
        System.out.println(set);

        System.out.println(set.size());

        System.out.println(set.contains(78));

    }
    
}
