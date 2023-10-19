import java.util.*;

// swapping of two variables without using 3rd variable

public class VariableSwap_Function {

    static void swap(int i,int j){
        System.out.println("The variables before swaping are:- "+i+" "+j);
        i = i-j;
        j = i+j;
        i = j-i;
        System.out.println("The variables After swaping are:- "+i+" "+j);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value for 'a' : ");
            int a = sc.nextInt();
            System.out.print("Enter the value for 'b' : ");
            int b = sc.nextInt();
            swap(a,b);
            sc.close();
    }
}
