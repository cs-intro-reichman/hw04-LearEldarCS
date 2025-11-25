public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int N = Integer.parseInt(args[0]);
        int primeCounter = 0;
        boolean[] prime = new boolean[N];
        for(int i = 0; i <= 1; i++) prime[i] = false;
        for(int i = 2; i <= N; i++) prime[i] = true;

        for(int i = 2; i*i <= N; i++) {
            if (prime[i]) {
                for(int j = i*i; j <= N; j += i) {
                    prime[j] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + N + ":");

        for(int k = 0; k <= N; k++) {
            if (prime[k] == true) {
                System.out.println(k);
                primeCounter++;
            }
        }

        
        double primePercentDouble = (double) primeCounter / N * 100;
        int primePercent = (int) primePercentDouble;

        System.out.println("There are " + primeCounter + " primes between 2 and " + N + " (" + primePercent + "% are primes)");

    }
}