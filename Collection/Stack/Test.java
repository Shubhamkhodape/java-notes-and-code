
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;


public class Test {
    public static void main(String[] args) {
    
        Stack<Integer> stack = new Stack<>();
        stack.add(11);
        stack.add(88);
        stack.add(15);
        stack.add(3);

        stack.push(90);
        stack.pop();
        stack.peek();
        System.out.println(stack.search(15));
        System.out.println(stack);

        System.out.println(stack);

        Iterator<Integer> iterator = stack.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        Collections.sort(stack);
        System.out.println(stack);



    }
}
