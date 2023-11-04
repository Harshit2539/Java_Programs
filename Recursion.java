import java.util.*;

public class Recursion {
   static void recursion(int m){
    if(m==0){
        return;
    }
    recursion(m-1);
    if(m%2==0){
        System.out.println(m);
    }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
         recursion(n);
         sc.close();
    }
}
