import java.util.*;

// swapping of two variables without using 3rd variable

public class Variable_Swap {
    public static void main(String[] args) {
        try (Scanner sc= new Scanner(System.in)){
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The variables before swaping are:- "+a+" "+b);
        a = a-b;
        b = a+b;
        a = b-a;
        System.out.println("The variables After swaping are:- "+a+" "+b);
        }

    }
}
