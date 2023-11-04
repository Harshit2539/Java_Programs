import java.util.*;

public class Rope_Cutting {
    static int piece(int n,int a,int b,int c){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
       int l1= piece(n-a,a,b,c);
       int l2= piece(n-b,a,b,c);
       int l3= piece(n-c,a,b,c);
       int max =Math.max(Math.max(l1,l2),l3);
       if(max== -1){
         return -1;
        }
       return max+1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of rope");
        int n= sc.nextInt();
        int a=2;
        int b=3;
        int c=5;
        System.out.println("MAx peices :-> "+piece(n,a,b,c));
        sc.close();
    }
}
