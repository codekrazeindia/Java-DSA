import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for writing the table...");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (i * n));

        }
        // for(int i = 6;i < 100;i++){
        // System.out.println("Hello user..."+i);
        // }
    }
}
