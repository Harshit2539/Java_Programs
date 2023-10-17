import java.util.*;

// Calculate that the year is a leap year or not

public class Leap_Year {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        try (Scanner sc = new Scanner(System.in)) {
            int year = sc.nextInt();
            if (year % 4 == 0) {
                if (year % 400 == 0) {
                        System.out.println(year + " is a leap year.");
                    } else {
                        System.out.println(year + " is not a leap year.");
                    }
                } else {
                    System.out.println(year + " is a leap year.");
                }

            }
        }
    }
