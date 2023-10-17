import java.util.*;

/*
 + + + + +
 +
 +
 +
 +
 */

public class Opposit7_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
         {
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
                if(i==i/2|| j==j/2){
                    System.out.print("+");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}