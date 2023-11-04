import java.util.*;

public class Prime_Recursion {
    static boolean prime(int m ,int i){
        if(i>m/2){
            return true;
        }
        if(m%i==0){
            // System.out.println("not  a prime");
            return false;
        }
            return prime(m,i+1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(prime(n,2)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        sc.close();
    }
}