import java.util.*;

public class Array_recursion {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        {
            int n = sc.nextInt();
            int i;
            int arr[] = new int[n];
            System.out.println("Enter the elements of array");
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the elemnt to be search ");
            int k = sc.nextInt();
            for (i = 0; i < n; i++) {
                if (arr[i] == k) {
                    System.out.println("At index ->  " + arr[i - 1]);
                }
                sc.close();
            }
        }
    }
}
/*
 * index=0;
 * static int find(int arr,int target, int index){
 * if(index>=arr.length){
 * return index;
 * }
 * if(arr[index]==target){
 * return index;
 * }
 * return find(arr,target,index-1);
 * }
 * 
 * public static void main(String[] args) {
 * System.out.println("Enter the size of array");
 * Scanner sc =new Scanner(System.in);
 * int arr[] = {2,3,4,5,6,7};
 * int target=6;
 * System.out.println(find(arr,target,0));
 * ==
 */
