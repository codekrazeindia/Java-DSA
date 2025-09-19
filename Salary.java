import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the basic salary of the person");
        double salary = sc.nextDouble();
        double HRA = 0;
        double DA = 0;
        double gross_salary = 0;
        if (salary <= 10000) {
            HRA = 0.2 * salary;
            DA = 0.1 * salary;
            gross_salary = HRA + DA + salary;
        } else if (salary <= 20000) {
            HRA = 0.25 * salary;
            DA = 0.35 * salary;
            gross_salary = HRA + DA + salary;
            System.out.println("the gross salary is" + gross_salary);
        } else if (salary > 20000) {
            HRA = 0.35 * salary;
            DA = 0.95 * salary;
            gross_salary = HRA + DA + salary;
            System.out.println("the gross salary is" + gross_salary);
        } else {
            System.out.println("the data is invalid");
        }
        System.out.println("the gross salary is" + gross_salary);
    }
}