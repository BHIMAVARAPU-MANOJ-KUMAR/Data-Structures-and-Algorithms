import java.util.Scanner;

public class Matrix {
    
    // Method to print the pattern based on size 'n'
    public static void print(int n) {
        // Outer loop: Controls the number of ROWS
        for (int i = 0; i < n; i++) {
            // Inner loop: Controls the number of COLUMNS
            for (int j = 0; j < n; j++) {
                System.out.print("*"+ " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer for the matrix size: ");
        // Check if the input is a valid integer
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            // Call the print method and pass the user input 'n'
            print(n);
        } else {
            System.out.println("Invalid input! Please run the program again and enter an integer.");
        }
        scanner.close();
    }
}