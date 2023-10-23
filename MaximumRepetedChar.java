import java.util.*;

// This program is used to find the maximum repeted character in string

public class MaximumRepetedChar {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.replaceAll("\\s","");
        // the above expression is used to replace all the spaces
        int arr[] = new int[127];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
        }
        int max = -1;
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (max < arr[str.charAt(i)]) {
                max = arr[str.charAt(i)];
                c = str.charAt(i);
            }
        }
        System.out.print("\nThe maximum repeated character is [" + c+" ]");
        sc.close();
    }
}
