import java.util.*;

// This program is used to check if the two given strings are anagram or not

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s = sc.nextLine();
        System.out.println("Enter the Second string");
        String se = sc.nextLine();
        // Checking for empty strings
        if (s.isEmpty() || se.isEmpty()) {
            System.out.println("One of the input strings is empty.");
        }
        char str1[] = s.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(str1);
        char str2[] = se.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(str2);
        int flag = 0;
        // Compare sorted arrays of Strings
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] != str2[i]) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("\nThe two strings are" + " anagrams of each other");
        else
            System.out.println("\nThe two strings are not" + " anagrams of each other");
        sc.close();
    }
}