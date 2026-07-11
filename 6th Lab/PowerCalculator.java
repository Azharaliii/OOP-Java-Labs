public class PowerCalculator {

    // Recursive method to compute X^n
    public static int power(int X, int n) {
        // Base case: X^0 = 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: X^n = X * X^(n-1)
        return X * power(X, n - 1);
    }

    public static void main(String[] args) {
        // Test the method
        int X = 4;
        int n = 5;
        int result = power(X, n);
        System.out.println(X + " raised to the power of " + n + " is: " + result);

        // Tracing the recursion
        System.out.println("Tracing the recursion for " + X + "^" + n + ":");
        tracePower(X, n, 0);
    }

    // Helper method to trace the recursion (optional)
    public static void tracePower(int X, int n, int depth) {
        System.out.println("Depth " + depth + ": Computing " + X + "^" + n);
        if (n == 0) {
            System.out.println("Depth " + depth + ": Base case reached, returning 1");
            return;
        }
        tracePower(X, n - 1, depth + 1);
        System.out.println("Depth " + depth + ": Returning " + X + " * " + X + "^" + (n - 1));
    }
}