import java.util.*;

// Calculating Armstrong number using functions

public class Armstrong_Function {


    static int Lenght(int a) {

        int c = 0;
        while (a > 0) {
            a = a/10;
            c++;
        }
        return c;
    }
    static int Power(int b, int e) {
        int pv = 1;
        for (int i = 1; i <= e; i++) {
            pv = pv*b;
        }
        return pv;
    }

    static int Armstrongnumber(int n) {
        int m = n;
        int nl = Lenght(m);
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += Power(lastDigit, nl);
            n /= 10;
        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
        int v = Armstrongnumber(n);
        if(n==v)
            {
                System.out.println("The Armstrong number of is: "+n);
            }
            else{
                System.out.println("Not an Armstrong Number "+n);
            }
            sc.close();
    }
}
