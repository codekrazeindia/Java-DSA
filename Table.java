import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the table no");
        int a = sc.nextInt();

        System.out.println(a);

        while (i <= 10) {

            System.out.println(a * i);
            i++;
        }
    }
}