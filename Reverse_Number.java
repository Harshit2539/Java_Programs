import java .util.*;

// Reverse of the given user input number

public class Reverse_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        try(Scanner sc =new Scanner(System.in)){
         int n=sc.nextInt();
         int rev=0;
            int r=0;
            while(n > 0){
                r = n % 10;
                rev = rev*10 + r;
                n = n / 10;
            }
            System.out.println("The Reverse number of digits  is:" +rev);
        }
    }
}
