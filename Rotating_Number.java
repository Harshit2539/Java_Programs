import java.util.*;

public class Rotating_Number {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements of array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        System.out.print("Rotated Array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        sc.close();
    }
}