import java.util.*;

/* ******
   ******
   ******
   ******
   ******
   ****** */


public class Solid_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter a number to print the pattern");
        Scanner sc=new Scanner(System.in);
        int i,j;
        int n= sc.nextInt();
        for(i=0;i<=n;i++){
            for(j=0;j<=n;j++){
                System.out.print("*"+"");
            }
            System.out.println("");
        }
        sc.close();
        }
}
