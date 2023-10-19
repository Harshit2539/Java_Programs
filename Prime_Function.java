import java.util.*;

// Check wether the number is a prime or not

public class Prime_Function {

    static boolean isprime(int num){
        for(int i=2;i<num/2;i++){
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
     {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isprime(n));
        sc.close();
}
}