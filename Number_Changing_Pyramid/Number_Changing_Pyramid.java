// package Number_Changing_Pyramid;
import java.util.Scanner;

public class Number_Changing_Pyramid {
    public static void main(String[] args) {
        int i,j,n,k;
        // Taking Input from users
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = 1;
        // outer loop to handle number of rows
        for(i=1; i<=n; i++){
            // inner loop to handle number of columns
            for(j=1; j<=i; j++){
                // printing value of num in each iteration
                System.out.print(k + " ");
                // increasing the value of num
                k++;
            }
            // printing new line for each row
            System.out.println("");
        }
    }
}
