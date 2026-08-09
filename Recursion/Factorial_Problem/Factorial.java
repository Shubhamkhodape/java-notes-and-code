
public class Factorial{
    public static void main(String[] args){
    int n = 5;

    long result = fact(n);
    System.out.println(result);

    }

public static int fact(int n){
    //base case
    if(n==0){
        return 1;
    }
    //processing + recursive call
    return n * fact(n -1);
}
}