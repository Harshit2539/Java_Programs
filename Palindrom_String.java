import java.util.*;


// This will print that the string is palindrom or not
// for example :--  madam/mam/mom/dad

public class Palindrom_String {
    public static void main(String[] args) {
        System.out.println("Enter the String to check the Palindrom");
        Scanner sc =new Scanner(System.in);
        String s  =sc.nextLine();
        String rev ="";
        for(int i=s.length()-1;i>=0;i--){
            rev =rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println(s+ " is a Palindrom String");
        }
        else{
            System.out.println(s +" is Not a Palindrom String");
        }
        sc.close();
    }
}
