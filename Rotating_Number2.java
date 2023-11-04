import java.util.*;

public class Rotating_Number2 {
    public static int length(int k) {
        int y = 0;
        while (k > 0) {
            k = k / 10;
            y++;
        }
        return y;
    }

    public static void nrotate(int n,int l,int r){
        double g,j;
        double z;
        int k=0;
        z=Math.pow(10,(l-1));
        g=n%10;
            j=n/10;
        for(int i=1;i<=r;i++){
            k=(int)(g*z+j);
            g=k%10;
            j=k/10;

        }
        System.out.println(k);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter how many time to rotate the number");
        int m = sc.nextInt();
        int num = length(n);
            // m = Math.abs(m);
            nrotate(n, num, m);
            sc.close();
    }
}