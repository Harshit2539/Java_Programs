// Check wether the number is a prime or not

public class PrimeNumber_Function {
    static void prime() {
        int limit = 100;
        boolean isPrime[] = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(limit); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j= j+i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Prime Numbers from 1 TO 100 ");
        prime();
    }
}