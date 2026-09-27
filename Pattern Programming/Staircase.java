import java.util.Scanner;

public class Staircase {
    
    // Method to print the right-angled triangle (stairs) pattern
    public static void print(int n) {
        // Outer loop: Controls the number of ROWS
        for (int i = 0; i < n; i++) {
            // Inner loop: Controls the number of COLUMNS
            // Notice how 'j <= i' instead of 'j < n'
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer for the stairs size: ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            print(n);
        } else {
            System.out.println("Invalid input!");
        }
        scanner.close();
    }
}