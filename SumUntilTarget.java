import java.util.Scanner;

public class SumUntilTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a target number: ");
        int target = scanner.nextInt();

        int sum = 0;
        int count = 0;

        while (sum < target) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            sum += number;
            count++;
        }

        System.out.println("Reached or exceeded the target!");
        System.out.println("Total sum: " + sum);
        System.out.println("Numbers entered: " + count);

       
    }
}
