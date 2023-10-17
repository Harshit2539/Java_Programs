import java.util.*;

// swapping of two variables without using 3rd variable
// with the help of ex-or gate

public class Variable_swap2 {
    public static void main(String[] args) {
        System.out.println("Enter The Numbers For Swap");
        try (Scanner sc= new Scanner(System.in)){
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The variables before swaping are:- "+a+" "+b);
        a = a ^ b;
        b = a ^ b;
        a = b ^ a;
        System.out.println("The variables After swaping are:- "+a+" "+b);
        }

    }
}
