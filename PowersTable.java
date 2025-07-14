public class PowersTable {
    public static void main(String[] args) {
        System.out.printf("%-4s %-6s %-6s %-6s%n", "N", "N^2", "N^3", "N^4");
        System.out.println("-------------------------");

        for (int n = 1; n <= 5; n++) {
            int n2 = n * n;
            int n3 = n * n * n;
            int n4 = n3 * n;  

            System.out.printf("%-4d %-6d %-6d %-6d%n", n, n2, n3, n4);
        }
    }
}
