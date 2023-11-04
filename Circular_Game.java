import java.util.*;

// Josephus problem/Circular Game
// Stack table
// (1,3) => (0)
// (2,3) => (0+3)%7=3
// (3,3) => (3+3)%7=6
// (4,3) => (6+3)%7=2
// (5,3) => (2+3)%7=5
// (6,3) => (5+3)%7=1
// (7,3) => (1+3)%7=4


public class Circular_Game {
    static int winner(int num,int kill){
        if(num==1){
            return 0;
        }
        return(winner(num-1, kill)+kill)%num;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no. of persons");
        int n=sc.nextInt();
        System.out.println("Enter the kill factor");
        int k=sc.nextInt();
        int ans=winner(n,k)+1;
        System.out.println("Winner is:->  "+ans);
        sc.close();
    }
}
