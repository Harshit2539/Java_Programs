import java.util.*;

public class Resurson_count {
    static void countdigit(int m){
        if(m==0){
            return;
        }
        countdigit(m/10);
        System.out.println(m%10);
    }
    public static void main(String[] args) {
        System.out.println("Enter the digit number");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        countdigit(n);
        sc.close();
    }
}
