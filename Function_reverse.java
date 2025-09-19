import java.util.Scanner;
public class Function_reverse {



    public static int reverse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no to print reverse");
        int n = sc.nextInt();
        int r = 0,p;
        while (n > 0) {

            p = n % 10;
            r = r * 10 + p;
            n = n / 10;
        }

        return r;
    }

    public static void main(String[] args) {
        
       //321
        System.out.println(reverse());
    }

}

