import java.util.*;

// This program is used to create the array of size N with N_Numbers of Elements in it

public class ArrayOfN_Numbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size Of array");
        int n = scan.nextInt();
        //Creating array of N size
        int a[] = new int[n];
         System.out.println("Enter the Elements Of array");
        for(int i=0;i<a.length;i++){
            a[i]=scan.nextInt();
        }
        scan.close();
        // Prints each sequential element in array a
        System.out.println("Printing the array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
    }
}
