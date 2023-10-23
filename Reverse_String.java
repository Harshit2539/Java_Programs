import java.util.*;

// This will print the Reverse  String

public class Reverse_String {
    public static void main(String[] args) {
        System.out.println("Enter the String to check the Palindrom");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev + " is The Reverse String");
        sc.close();
    }
}
