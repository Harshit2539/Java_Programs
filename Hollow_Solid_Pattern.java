import java.util.*;

/* *****
   *   *
   *   *
   *   *
   *****  */

public class Hollow_Solid_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter a number to print the pattern");
        Scanner sc=new Scanner(System.in);
        int i,j;
        int n= sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       sc.close();
    }
}
