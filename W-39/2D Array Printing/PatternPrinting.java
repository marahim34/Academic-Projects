import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class PatternPrinting {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int n = 4;

        int s = n - 1, k = 1;

        for (int i = 1; i <= n; i++) {
            // Printing space
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }

            // Printing stars
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }

            s--;
            k = k + 2;
            System.err.println();
        }
    }
}
