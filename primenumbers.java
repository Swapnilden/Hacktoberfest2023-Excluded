public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 20; // Change this to generate prime numbers up to a different limit
        System.out.println("Prime numbers up to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
