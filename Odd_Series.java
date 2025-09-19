public class Odd_Series {
    public static void main(String[] args) {
        int sum_odd = 0;
        for (int i = 0; i < 7; i++) {
            System.out.println("At " + i + " = " + (2 * i + 1));
            sum_odd += (2 * i + 1);
        }
        System.out.println(sum_odd);
        // ====================================================================\
        //SUM OF DIGITS::::::
        int m = 5;
        int sum = 0;
        for (int i = m; i > 0;) {
            sum += i % 10;
            i /= 10;
        }
        System.out.println(sum);
        // ================================================================
        int n = 7;
        int sum_ = 0;
        for (int i = 1; i <= n; i++) {
            sum_ += i;
        }
        System.out.println(sum_);

    }
}

