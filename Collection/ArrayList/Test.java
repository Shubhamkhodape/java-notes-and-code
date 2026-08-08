import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Test{
    
public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    //Adding elements to the list
    list.add(12);
    list.add(27);
    list.add(11);
    list.add(5);

    //get method 
    System.out.println(list.get(0));

    
    System.out.println(list);

    //Set the element at any index
    list.set(2, 25);
    System.out.println(list);


    //Sorting the list in ascending order
    list.sort(null);
    System.out.println(list);

    //Sorting the list in descending order
    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);


    //Iterating through the list using Iterator
    Iterator<Integer> listIterator = list.iterator();
    while(listIterator.hasNext()){
        System.out.println(listIterator.next());
    }

    //Clone 
    ArrayList<Integer> newList =(ArrayList<Integer>)list.clone();
    System.out.println(newList);

    //ensureCapacity
    newList.ensureCapacity(10);
    

    //isEmpty()
    System.out.println(list.isEmpty());
    System.out.println(newList.isEmpty());

    //indeOf()
    System.out.println(list.indexOf(12));
    
}
}