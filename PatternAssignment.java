import java.util.Scanner;

public class PatternAssignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no where we have to print");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            if (i <= 1) {
                break;
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i + 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i + 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

// 1 1 1 1 1
// 2 2 2 25
// 3 3 3
// 4 4
// 5
// 4 4
// 3 3 3
// 2 2 2 2
// 1 1 1 1 1