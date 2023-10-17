import java.util.*;
/*
*****
 *****
  *****
   *****
    *****
 */
public class Rombous_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter a number to print the pattern");
        Scanner sc=new Scanner(System.in);
        int i,j;
        int n= sc.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(j=n;j>=1;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}

