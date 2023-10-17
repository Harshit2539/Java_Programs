
import java.util.*;

// This Program is used to calculate the Area_of_Rectangle

public class Area_of_Rectangle {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        try (Scanner sc = new Scanner(System.in)) {
            int l =sc.nextInt();
            int b =sc.nextInt();
            int area = l* b;
            System.out.println("The area of rectangle is:"+area);
        }

    }
}
