import java.util.Scanner;

public class HalfDiamond {

    public static void print(int n){
        for(int i=1;i<2*n-1;i++){
            int stars;
            if(i<=n){
                stars = i;
            }
            else
                stars = (2*n)-i;
            for(int j=1;j<stars;j++){
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
