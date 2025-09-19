import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first value");
        float n = sc.nextFloat();
        System.out.println("enter the second  value");
        float m = sc.nextFloat();
        float addition = n + m;
        float sub = n - m;
        float mul = n * m;
        float div = n / m;

        System.out.println("Enter 1 for addition..");
        System.out.println("Enter 2 for subtraction..\nEnter 3 for multiplication..\nEnter 4 for division..\n");

        int calculator = sc.nextInt();




        
        int day = 6;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid input");

        }
    }
}
