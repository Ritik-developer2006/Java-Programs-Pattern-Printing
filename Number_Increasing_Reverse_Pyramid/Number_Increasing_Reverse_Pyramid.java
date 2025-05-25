// package Number_Increasing_Reverse_Pyramid;
import java.util.Scanner;

public class Number_Increasing_Reverse_Pyramid {
    public static void main(String[] args) {
        int i,j,n;
        // Taking Input from users
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // outer loop to handle number of rows
        for(i=n; i>=1; i--){
            // inner loop to handle number of columns
            for(j=1; j<=i; j++){
                // printing value of j in each iteration
                System.out.print(j + " ");
            }
            // printing new line for each row
            System.out.println("");
        }
    }
}
