public class EvenFibSum {

    // Public method to calculate the sum of even Fibonacci numbers up to n
    public static Integer evenFibonacciSum(Integer n) {
        int sum = 0;
        int a = 1, b = 2; // Initialize the first two Fibonacci numbers

        while (a <= n) {
            if (a % 2 == 0) {
                sum += a; // Add even Fibonacci numbers to the sum
            }
            int next = a + b; // Calculate the next Fibonacci number
            a = b; // Update a to the next Fibonacci number
            b = next; // Update b to the next Fibonacci number
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test the method
        Integer n = 100; // Example input
        Integer result = evenFibonacciSum(n);
        System.out.println("Sum of even Fibonacci numbers up to " + n + " is: " + result);
    }
}