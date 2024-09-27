import java.util.Scanner;

public class StarPrinting {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int number = userInput.nextInt();

        int k = 1;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print("*");

            }
            System.out.println();
            k++;
        }

    }
}
