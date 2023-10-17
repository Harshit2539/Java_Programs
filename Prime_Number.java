import java.util.*;

// Check wether the number is a prime or not

public class Prime_Number {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i;
            for (i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    break;
                }
            }
            if (i == n) {
                System.out.print("Prime number: " + n);
            } else {
                System.out.println("NOt a prime number: ");

            }
        }
    }
}
