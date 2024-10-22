import java.util.Scanner;

public class PrintingTime {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        try {
            System.out.println("Input a number that your want to convert into minutes and seconds");
            int seconds = userInput.nextInt();

            int minutes = seconds / 60;
            int remainder = seconds % 60;

            System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainder + " seconds!");
            userInput.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("An error occurred while taking inputs");
        }

    }
}
