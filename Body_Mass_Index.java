import java.util.*;

// This program is used to calculate body mass index

public class Body_Mass_Index {
    public static void main(String[] args) {
        System.out.println("Enter the weight");
        try (Scanner sc = new Scanner(System.in)) {
            int w = sc.nextInt();
            System.out.println("Enter the Height");
            int h = sc.nextInt();
            float b = (float)w/(h*h);
            System.out.println("THE BMI OF THE PERSON IS:"+b);
            System.out.println((b<=18.4)?"Under weight":"");
            System.out.println((b>=18.4 && b<24.5)?"overWeight":"not over weight");
        }
    }
}
