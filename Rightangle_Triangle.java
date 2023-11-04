public class Rightangle_Triangle {
    static void starp(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("*");
            starp(n-1);
        }
        static void printpattern(int col,int row){
            if(row==0){
                return;
            }
            starp(col);
            System.out.println();
            printpattern(col-1,row-1);
        }

    public static void main(String[] args) {
        printpattern(5,5);
    }
}
