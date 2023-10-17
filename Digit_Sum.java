import java.util.*;

// This will sum up the "n" number of digits Enter by the user

public class Digit_Sum {
    public static void main(String[] args) {
        System.out.println("Enter a digit number");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum=0;
            int r=0;
            while(n > 0){
                r = n % 10;
                sum = sum + r;
                n = n / 10;
            }
        System.out.println("The Sum of digits  is:" +sum);
        }
    }
}
