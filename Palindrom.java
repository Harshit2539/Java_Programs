import java .util.*;

// Check Wether the user input number is a palindrom or not

public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        try(Scanner sc =new Scanner(System.in)){
         int n=sc.nextInt();
         int rev=0;
         int m=n;
            int r=0;
            while(n > 0){
                r = n % 10;
                rev = rev*10 + r;
                n = n / 10;
            }
            if(m==rev){
                System.out.println("The number is palindronm number");
            }else{
                System.out.println("The number is NOT A palindronm number");
        //   1221
            }
        }
    }
}
