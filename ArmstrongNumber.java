import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number...");
        int n = sc.nextInt();
        int original = n;
        int digit = 0;
        int sum = 0;
        int value = 0;
        // n = 123;
        while (n > 0) {
            digit++;
            n /= 10;
        }
        // System.out.println("Your number has " + "n " + n + " " + digit + " count");
        n = original;
        // System.out.println("n is " + n);

        while (n > 0) {

            value = (int) Math.pow(n % 10, digit);
            sum = sum + value;
            n /= 10;
        }
        System.out.println("Your sum of of power values : " + sum);
        if (original == sum) {
            System.out.println("Number is an Armstrong...");
        } else {
            System.out.println("Number is not an Armstrong..");
        }
    }

}
