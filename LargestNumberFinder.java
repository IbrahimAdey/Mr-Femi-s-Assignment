import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int largest;

        System.out.print("Enter number 1: ");
        int number = scanner.nextInt();
        largest = number;

        while (counter < 10) {
            counter++;
            System.out.print("Enter number " + counter + ": ");
            number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("The largest number is " + largest);

    }
}
