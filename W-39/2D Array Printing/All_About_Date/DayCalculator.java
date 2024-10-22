import java.time.DayOfWeek;

public class DayCalculator {
    public static void main(String[] args) {
        // Today's day as Tuesday
        DayOfWeek today = DayOfWeek.TUESDAY;
        int daysToAdd = 100;

        // Calculate future day
        DayOfWeek futureDay = today.plus(daysToAdd % 7);

        System.out.println("In " + daysToAdd + " days, it will be " + futureDay + ".");
    }
}
