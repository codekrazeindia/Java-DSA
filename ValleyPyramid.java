public class ValleyPyramid {
    public static void main(String[] args) {
        int i, j;
        int n = 6;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // for (j = 5; j >= i; j--) {
            // System.out.print(" ");
            // }

            // for (j = 5; j >= i; j--) {
            // System.out.print(" ");
            // }
            for (j = i + 1; j <= 2 * n - i; j++) {
                System.out.print("  ");
            }
            for (j = 2 * n - i + 1; j <= 2 * n; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }
}

// 1 2 3 4 5 6 7 8 9 101112
// 1 * *
// 2 * * * *
// 3 * * * * * *
// 4 * * * * * * * *
// 5 * * * * * * * * * *
// 6 * * * * * * * * * * * *
