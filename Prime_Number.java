import java.util.*;

// Check wether the number is a prime or not

public class Prime_Number {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i;
            int a=12;
            for (i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    a=13;
                    break;
                }
            }
            if (a==12){
                System.out.print("Prime number: "+n);
                }
                else{
                    System.out.println("Not a prime number: " + n);
                }
        }
    }
}
