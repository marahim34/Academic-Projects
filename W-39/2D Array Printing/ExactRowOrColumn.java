import java.util.Scanner;

public class ExactRowOrColumn {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Input your matrix here");

        int row = userInput.nextInt();
        int column = userInput.nextInt();

        int[][] arr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = userInput.nextInt();
            }
        }

        System.out.println("Which row you want to see");

        int desiredRow = userInput.nextInt();

        if (desiredRow < 1 || desiredRow > row) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("This is your desired row");

            for (int j = 0; j < column; j++) {
                System.out.print(arr[desiredRow - 1][j] + " ");
            }

        }

    }
}
