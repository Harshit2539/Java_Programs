import java.util.*;

// Grading System for students to calculate grades of the three subject marks

public class Grading_System {
    public static void main(String[] args) {
        System.out.println("Enter the marks");
        try (Scanner sc = new Scanner(System.in)) {
            int chem =sc.nextInt();
            int phy = sc.nextInt();
            int maths = sc.nextInt();
            System.out.println("Enterd  marks of chemistry is: "+chem);
            System.out.println("Enterd  marks of physics is: "+phy);
            System.out.println("Enterd  marks of maths is: "+maths);
            double avg=(double)(chem + phy + maths )/3;
            System.out.printf("%-10f",avg );
            if((avg<100 && avg>80)){
                System.out.print("\nGrade A+ ");
             }else if((avg<80 && avg>70)){
                System.out.println("\n Grade B+");
             }else if((avg<70 && avg>60)){
                System.out.println("\n Grade c+");
             }else if((avg<60 && avg>50)){
                System.out.println("\n Grade D+");
             }else if((avg<50 && avg>40)){
                System.out.println("\n Grade E+");
             }else{
                System.out.println("\n Grade Fail");
             }
            }
    }
}
