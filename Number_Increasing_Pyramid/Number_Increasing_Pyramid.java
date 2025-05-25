import java.util.Scanner;

public class Number_Increasing_Pyramid{
    public static void main(String[] args){
        int i,j,n;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print(j);
            }
        System.out.println("");
        }
    }
}