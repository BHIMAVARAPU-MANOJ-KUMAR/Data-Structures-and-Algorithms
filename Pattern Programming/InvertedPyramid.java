import java.util.Scanner;

public class InvertedPyramid {

    public static void print(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer for the size: ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            print(n);
        } else {
            System.out.println("Invalid input!");
        }
        scanner.close();
    }
}
