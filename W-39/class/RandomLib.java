import java.util.Random;

public class RandomLib {
    public static void main(String[] args) {
        Random random = new Random();

        int number = 0;

        while (true) {
            number = random.nextInt(10) + 1;
            System.out.println("Randomly Generated Number: " + number);

            if (number == 9) {
                System.out.println("You are caught at 9! You won't go forward.");
                break;
            }
        }
    }
}
