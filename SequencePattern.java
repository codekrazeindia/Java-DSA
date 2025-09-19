import java.util.Scanner;

public class SequencePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for pattern printing..");
        int r = sc.nextInt();

        for (int i = 1; i < r; i++) {
            int n = 1;
            for (int j = 1; j < r - i; j++) {
                System.out.print(" ");
            }

            for (int j = r - i; j < r; j++) {
                System.out.print(n);
                n = n + 1;
            }
            if (i >= 2) {
                for (int k = r; k < 2 * i + 1; k++) {
                    System.out.print(n - 1);
                    n = n - 1;
                }
            }
            System.out.println();
        }
    }
}
// 1
// 121
// 12321
// 1234321

// 1. 00005
// 2. 00045
// 3. 00345
// 4. 02345
// 5. 12345

*           *
* *       * *
* * *   * * *
* * * * * * *


* * * * *
* * * *
* * *
* * 
*
* * 
* * *
* * * * 
* * * * *