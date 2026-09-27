import java.util.Scanner;

public class RepeatingRowNumbers {

    public static void print (int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
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
