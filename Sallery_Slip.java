import java .util.*;

// Sallery slip of the employ including tax

public class Sallery_Slip {
    public static void main(String[] args) {
        System.out.println("******Enter your details*****");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Name: ");
             String name = sc.next();
             System.out.println("Enter your Salery: ");
            float salery =sc.nextFloat();
            float HRA= (float) (salery * 0.3);
            float DA= (float) (salery*0.2);
            int TA= 2000;
            float gross = salery+ HRA +DA +TA;
            float tax=0;
            if(gross<=10000){
                 tax = 0;
                float NEt1 =gross - tax;
                System.out.println("Name :"+name);
                    System.out.println("Salery: "+salery);
                    System.out.println("HRA of person: "+HRA);
                    System.out.println("DA of person: "+DA);
                    System.out.println("TA of person: "+TA);
                    System.out.println("THE gross of the person is :"+gross);
                    System.out.println("The net salery person got: "+NEt1);
            }
            else if(gross>10000 && gross<=20000){
                tax =(float) (gross *0.05);
                    float NEt =gross - tax;
                    System.out.println("Name :"+name);
                    System.out.println("Salery: "+salery);
                    System.out.println("HRA of person: "+HRA);
                    System.out.println("DA of person: "+DA);
                    System.out.println("TA of person: "+TA);
                    System.out.println("THE gross of the person is :"+gross);
                    System.out.println("The net salery person got: "+NEt);
            }else if(gross>20000 && gross<=25000){
                tax =(float) (gross *.15);
                    float NEt =gross - tax;
                    System.out.println("Name :"+name);
                    System.out.println("Salery: "+salery);
                    System.out.println("HRA of person: "+HRA);
                    System.out.println("DA of person: "+DA);
                    System.out.println("TA of person: "+TA);
                    System.out.println("THE gross of the person is :"+gross);
                    System.out.println("The net salery person got: "+NEt);

            }else{
                tax =(float) (gross *.25);
                    float NEt =gross - tax;
                    System.out.println("Name :"+name);
                    System.out.println("Salery: "+salery);
                    System.out.println("HRA of person: "+HRA);
                    System.out.println("DA of person: "+DA);
                    System.out.println("TA of person: "+TA);
                    System.out.println("THE gross of the person is :"+gross);
                    System.out.println("The net salery person got: "+NEt);
            }
            sc.close();
    }
}
