import java.util.*;

// This Program helps us to define about our age Groups

public class Age_Group {
    public static void main(String[] args) {
        System.out.println("Enter Your Age");
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            System.out.println(((age>0 && age<=12)?"Your are a child":(age>12 && age<18)?"You are a tean ager":"You are young"));
        }

    }
}
