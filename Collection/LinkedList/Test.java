
import java.util.*;


public class Test {
    public static void main(String[] args){

        System.out.println();

        LinkedList<Integer> link = new LinkedList<>();
        link.add(10);
        link.add(20);
        link.add(13);
        link.add(19);

        System.out.println(link);

        List<Integer> link1 = new LinkedList<>();
        link1.add(11);

        link.addAll(link1);
        System.out.println(link);

        link.addFirst(15);
        System.out.println(link);

        link.addLast(9);
        System.out.println(link);

        link.remove(2);
        System.out.println(link);

        System.out.println(link.get(1));

        System.out.println(link.set(1, 2));

        System.out.println(link.peek());

        Iterator<Integer> iterator = link.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    

}
