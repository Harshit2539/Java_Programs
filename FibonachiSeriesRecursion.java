import java .util.*;

// Fibonachi Series By recursion

public class FibonachiSeriesRecursion {
    static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
            return (fib(n-1)+fib(n-2));
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of terms you want in fibonacci series:");
        int num =sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fib(i) + " ");
        }
        sc.close();
    }
}
