import java.util.Scanner;

public class FibonacciOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        long a = 0, b = 1;

        System.out.println("Fibonacci Sequence up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println(); // clean output
    }
}
