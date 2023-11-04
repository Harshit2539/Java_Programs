// import java.util.Scanner;

public class Sorted_array {
    static boolean sort(int ar[],int i ){
        if(i==ar.length){
            return true;
        }
        if(ar[i-1]>ar[i]){
            return false;
        }
        return sort(ar,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        System.out.println(sort(arr,1));
        // sc.close();
    }
}
