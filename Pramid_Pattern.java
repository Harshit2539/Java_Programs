import java.util.*;


/*
    *
   ***
  *****
 *******
*********
 */
public class Pramid_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter a number to print the pattern");
        Scanner sc=new Scanner(System.in);
        int i,j;
        int n= sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
