import java.util.Scanner;

public class InvertedNumberTraiangle {

    public static void print(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j + " ");
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
