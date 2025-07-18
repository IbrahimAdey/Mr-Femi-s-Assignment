import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            number = scanner.nextInt();

            if (number >= 0) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a non-negative integer.");
            }
        }

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);

       
    }
}
