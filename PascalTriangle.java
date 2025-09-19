import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n;i++){
            int c = 1;
            for(int j = 1; j <= i;j++){
                
                // i = 1 , j = 1 => 0
                // i = 2 , j = 2 => 0
                // i = 3 , j = 3 = >
                // i = 4 , j = 3
                System.out.print(c + " ");
                c = c * (i-j)/j; 
            }
            System.out.println();
        }
    }
}
// 1
// 1 1
// 1 2 1
// 1 3 3 1
