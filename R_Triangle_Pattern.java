import java.util.*;

/*
******
*****
****
***
**
*
 */

public class R_Triangle_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter a number to print the pattern");
        Scanner sc=new Scanner(System.in);
        int i,j;
        int n= sc.nextInt();
        for(i=0;i<=n;i++){
         for(j=n;j>=i;j--){
            System.out.print("*");
         }
         System.out.println("");
        }
        sc.close();
    }
}


