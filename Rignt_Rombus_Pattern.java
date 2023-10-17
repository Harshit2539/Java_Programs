import java.util.*;

/*
     *****
    *****
   *****
  *****
 *****
 */
public class Rignt_Rombus_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter a number to print the pattern");
        Scanner sc=new Scanner(System.in);
        int i,j;
        int n= sc.nextInt();
        for(i=n;i>0;i--){
            for(j=i;j>0;j--){
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}

