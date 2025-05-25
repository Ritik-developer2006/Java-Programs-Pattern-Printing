// package Number_Triangular;
import java.util.Scanner;

public class Number_Triangular {
    public static void main(String[] args) {
        int i,j,n;
        // Taking input from users
        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // outer loop to handle number of rows
        for(i = 1; i <= n; i++){
            // inner loop to print space
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print number
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // print new line for each row
            System.out.println();  
        }
    }
}
