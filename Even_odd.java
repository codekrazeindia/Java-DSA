import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for num");
        int num = sc.nextInt();
        if ((num % 5 == 0) && (num % 11 == 0)) {
            System.out.println(num + " Number is Lucky..");
        } else {
            System.out.println(num + " Number is Unlucky..");
        }
    }
}
