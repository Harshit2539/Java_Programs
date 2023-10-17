import java.util.*;

// Armstrong number

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        try(Scanner sc=new Scanner(System.in)){
            int n = sc.nextInt();
            int sum=0;
            int r;
            int m=n;
            while(n > 0){
                r = n % 10;
                sum = sum + r*r*r;
                n = n / 10;
            }
            if(sum==m)
            {
                System.out.println("The Armstrong number of is: "+sum);
            }
            else{
                System.out.println("Not an Armstrong Number "+m);
            }
        }
    }
}
