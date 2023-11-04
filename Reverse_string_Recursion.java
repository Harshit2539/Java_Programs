
import java.util.*;

public class Reverse_string_Recursion {
    static String rev = "";
    static String reverse(String s,int index){
        if(index<=-1){
            return rev;
        }
        char a =s.charAt(index);
            rev = rev + a;
        return reverse(s,index-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the String to check the Palindrom");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n=s.length()-1;
        System.out.println(reverse(s,n));
        sc.close();
    }
}
