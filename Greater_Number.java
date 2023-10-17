import java.util.*;

// Check which number is greater than amongs the three user input number

public class Greater_Number {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(((a>b && a>c)?"A is greater"+a:(b>c)?b:c));
        }

    }
}
