import java.util.*;

// Calculating Armstrong number using functions

public class Armstrong_Function {

    static int calculation(int a,int s){
        int r;
        while(a > 0){
            r = a % 10;
            s = s + r*r*r;
            a = a / 10;
        }
        return (s);

    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         int m=n;
         int sum=0;
         sum = calculation(n,sum);

         if(sum==m)
            {
                System.out.println("The Armstrong number of is: "+sum);
            }
            else{
                System.out.println("Not an Armstrong Number "+m);
            }
            sc.close();
    }
}
