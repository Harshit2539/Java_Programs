import java.util.*;

// Calculate that the year is a leap year or not

public class LeapYear_Function {

    static void leapyear(int y){
        if (y % 4 == 0) {
            if (y % 400 == 0) {
                    System.out.println(y + " is not a leap year.");
                } else {
                    System.out.println(y + " is a leap year.");
                }
            } else {
                System.out.println(y + " is not a leap year.");
            }

    }
    public static void main(String[] args) {
    System.out.println("Enter the year");
    Scanner sc = new Scanner(System.in);
     int year = sc.nextInt();
     leapyear(year);
     sc.close();
    }
}
