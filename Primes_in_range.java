import java.util.Scanner;
public class PrimeCountInRange {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimesInRange(int m, int n) {
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();  
        int n = sc.nextInt();  

        int primeCount = countPrimesInRange(m, n);
        System.out.println(primeCount);
    }
}