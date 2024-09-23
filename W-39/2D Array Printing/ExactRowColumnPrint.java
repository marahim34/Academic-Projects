import java.util.Scanner;

public class ExactRowColumnPrint {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Input your desired size for row and column");
        int row = userInput.nextInt();
        int column = userInput.nextInt();

        int[][] arr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = i + j;
                System.out.print("*");
            }
            System.out.println();
        }
        userInput.close();
    }
}
