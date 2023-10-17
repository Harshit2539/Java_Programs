import java.util.*;

// Factorial of the User input number

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number for factorial");
       try(Scanner sc = new Scanner(System.in)){
        int n=sc.nextInt();
        int fact=1;
        int i;
        for(i=1; i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The result of factorial is:"+fact);
        }
    }
}
