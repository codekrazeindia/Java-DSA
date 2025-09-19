public class ABCPattern {
    public static void main(String[] args) {
        int n = 65;
        int m = n;
        // for (int i = 0; i <= 3; i++) {
        // for (int j = n + i; j <= n; j++) {
        // System.out.print((char) j);

        // }
        // System.out.println();
        // }

        for (int i = 0; i <= 3; i++) {
            for (int j = n; j <= n + i; j++) {
                System.out.print((char) (j + i));
            }

            System.out.println();
        }
    }

}
// A
// B C
// C D E
// D E F G

// m = 65;
// 0 65      65 
// 1 66 67   65 ,65+1 = 66 
// 2 67 68 69 m =65
// 3 68 69 70 71
// n = 1 2 3
// 1+3
// 3+1

// n = 1 2 3 4
// 1+3
// 3+1

// n = "Riya"
// R,i,y,a
// 0 1 2 3
// charAt(3)