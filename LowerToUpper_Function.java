import java.util.*;

// Convert Upper to lower case and vice versa

public class LowerToUpper_Function {

    static String convert(String str) {
        int n = str.length();
        char arr[] = new char[n];
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                arr[i] = Character.toUpperCase(str.charAt(i));
            } else {
                arr[i] = Character.toLowerCase(str.charAt(i));
            }
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Output after converting is : " + convert(str));
        sc.close();
    }
}