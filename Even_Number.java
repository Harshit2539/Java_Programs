import java.util.*;

// Check wether the user input number is Even / Odd

public class Even_Number {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            System.out.println(((a%2==0)?"The number is even":"The number is odd"));
        }
    }
}
