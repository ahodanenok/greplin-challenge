public class Part2 {

    public static void main(String[] args) {
        int f = nextPrimeFib(227000);
        System.out.println(f);
        System.out.println(primeDivisorsSum(f + 1));
    }

    private static int nextPrimeFib(int n) {
        int curr = 1;
        int prev = 1;
        int tmp;
        while (curr < n || !isPrime(curr)) {
            tmp = curr;
            curr += prev;
            prev = tmp;
        }

        return curr;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int primeDivisorsSum(int n) {
        int sum = 0;
        int lim = (int) Math.sqrt(n);
        for (int i = 2; i < lim; i++) {
            if (n % i == 0 && isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }
}
