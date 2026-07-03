import java.util.Random;

public class RainfallAnalysis {

    public static void main(String[] args) {

        Random random = new Random();

        double[] rainfall = new double[30];

        double total = 0;
        int wetDays = 0;

        // Generate rainfall readings
        for (int i = 0; i < rainfall.length; i++) {

            rainfall[i] = random.nextInt(61); // 0–60 mm

            total += rainfall[i];

            if (rainfall[i] > 30) {
                wetDays++;
            }
        }

        double average = total / rainfall.length;

        System.out.println("Daily Rainfall:");

        for (int i = 0; i < rainfall.length; i++) {
            System.out.println(
                    "Day " + (i + 1) +
                    ": " + rainfall[i] + " mm");
        }

        System.out.println("\nTotal rainfall: "
                + total + " mm");

        System.out.println("Average rainfall: "
                + average + " mm");

        System.out.println("Wet days: "
                + wetDays);

        if (total <= 300) {
            System.out.println(
                    "Classification: Dry");
        }
        else if (total < 600) {
            System.out.println(
                    "Classification: Normal");
        }
        else {
            System.out.println(
                    "Classification: Flood-risk");
        }
    }
}