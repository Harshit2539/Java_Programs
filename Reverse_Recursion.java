import java.util.*;

public class Reverse_Recursion {
    static int rev=0;
    static int reverse(int m){
        if(m<=0){
            return rev;
        }
        int rem=m%10;
        rev=rev*10+rem;
        return reverse(m/10);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(reverse(n));
        sc.close();
    }
}
