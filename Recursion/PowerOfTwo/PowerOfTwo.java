
public class PowerOfTwo{
    public static void main(String[] args) {
        int n = 3;
        long res = power(n);
        System.out.println(res);
    }

    public static int power(int n){
        //base case
        if(n == 0){
            return 1;
        }

        //processing + recursive call
        return 2 * power(n -1);
    }
}