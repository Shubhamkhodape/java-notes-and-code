

public class Tester {
    public static void main(String[] args) {

        int n = 5;
        rec(n);
    }

    //Basic recursion 
    public static void rec(int n){
        //Base case
         if(n == 0){
            
            return;
        }
        System.out.println("Hello");
        rec(n -1);
    }
}