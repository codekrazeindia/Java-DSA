import java.util.Scanner;

public class Functionsarmstrong {
    public static int count(int n) {

        int digit = 0;
        while (n > 0) {
            digit++;
            n = n / 10;
        }
        System.out.println("the no if digit is " + digit);
        return digit;
    }

    public static int sum(int n, int digit) {
        int value = 0;
        int sum = 0;
        while (n > 0) {
            
            value = (int) Math.pow(n % 10, digit);
            sum = sum + value;
            n = n / 10;
        }
        return sum;

    }

    public static void check(int s, int n) {
        if (s == n) {
            System.out.println("the no is armstrong");
        } else {
            System.out.println("the no is not armstrong");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no to check armstrong");
        int n = sc.nextInt();
        int co = count(n);
        int s = sum(n, co);
        check(s, n);
        // check(sum(n, count(n)), n);
    }
}
