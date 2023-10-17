import java.util.*;

// Check wether the user input Character is vowel or not

public class Vowels {
    public static void main(String[] args) {
        System.out.println("Enter the letter");
        try(Scanner sc = new Scanner(System.in)){
         String ch = sc.next();
         if(ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u") || ch.equals("A") || ch.equals("E") || ch.equals("I") || ch.equals("O") || ch.equals("U")){
            System.out.println("its is vowel");
            }
            else{
                  System.out.println("it is not vowel it is a constant");
            }
        }
    }
}

