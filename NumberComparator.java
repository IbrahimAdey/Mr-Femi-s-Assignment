import java.util.Scanner;

public class NumberComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

       
        if (first == second) {
            System.out.println(0);
        } else if (first > second) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }

      
    }
}
