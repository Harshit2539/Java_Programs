import java.util.*;

// Enter the number of Day you Want to print

public class Days {
    public static void main(String[] args) {
        System.out.println("Enter the day no.");
       try( Scanner sc = new Scanner(System.in)){
        int n=sc.nextInt();
        if(n== 1){
            System.out.println("Day 1 monday");
        }else if(n== 2){
            System.out.println("Day 2 tuesday");
        }else if(n== 3){
            System.out.println("Day 3 Wednesday");
        }else if(n== 4){
            System.out.println("Day 4 thursday");
        }else if(n== 5){
            System.out.println("Day 5 Friday");
        }else if(n== 6){
            System.out.println("Day 6 Saturday");
        }else if(n== 7){
            System.out.println("Day 7 sunday");
        }else{
            System.out.println("Invalid number");
        }
       }
    }
}
