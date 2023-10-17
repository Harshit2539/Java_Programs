import java.util.*;

// This  will calculate the 'n' number of digits enter by the user

public class Count_Digit {
    public static void main(String[] args) {
        System.out.println("Enter a digit number");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum=0,count=0;
            int r=0;
            while(n > 0){
                r = n % 10;
                sum = sum + r;
                n = n / 10;
              ++ count;
            }
        System.out.println("The total number of digits in number is:" +count);
        }
    }
}
