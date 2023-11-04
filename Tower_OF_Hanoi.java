import java.util.*;
// This Program is for Tower Of Hanoi By recursion

public class Tower_OF_Hanoi {
    public static void move(int n, int startPole, int endPole) {
        if (n== 0){
            return;
        }
        int intermediatePole = 6 - startPole - endPole;
        move(n-1, startPole, intermediatePole);
        System.out.println("Move " +n + " from " + startPole + " to " +endPole);
        move(n-1, intermediatePole, endPole);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of Disks you have");
        int n= sc.nextInt();
        sc.close();
        move(n, 1, 3);
    }


}