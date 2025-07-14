import java.util.Scanner;

public class MileageTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        while (true) {
            System.out.print("Enter miles driven (-1 to quit): ");
            int miles = scanner.nextInt();

            if (miles == -1) {
                break;
            }

            System.out.print("Enter gallons used: ");
            int gallons = scanner.nextInt();

            
            if (gallons == 0) {
                System.out.println("Gallons used cannot be zero. Try again.");
                continue;
            }

            
            double tripMPG = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", tripMPG);

            
            totalMiles += miles;
            totalGallons += gallons;

            
            double combinedMPG = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon so far: %.2f%n%n", combinedMPG);
        }

        System.out.println("Thanks for using the Mileage Tracker!");
        
    }
}
