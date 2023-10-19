import java.util.*;

// Convert Celsius into Fahrenheit and vice versa

public class TempratureConversion {

    static float convert(float t) {
        return (t * 9 / 5) + 32;
    }

    static float convertc(float t) {
        return ((t - 32) * 5 / 9);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in celsius to convert it in Fahrenheit: ");
        float temp = sc.nextFloat();
        System.out.println("Enter 'f' to convert celsius  into Fahrenheit: ");
        System.out.println("Enter 'c' to convert Fahrenheit  into celsius : ");
         char ch=sc.next().charAt(0);
        switch(ch){
            case 'f':{
                System.out.println("Temperature in Fahrenheit: " + convert(temp));
                break;
            }
            case 'c':{
                System.out.println("Temperature in Celsius: "+ (convertc(temp)));
                break;
            }
            default:{
                System.out.println("Invalid choice");
            }
        }
        sc.close();
}
}
