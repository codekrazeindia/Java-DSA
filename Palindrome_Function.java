import java.util.Scanner;

public class Palindrome_Function {
    public static int reverse(int n){
// body.....123
int rev = 0;
        while (n > 0){
            rev = rev * 10 + n%10;
            n /= 10;
        }
        return rev;
    }
    public static void checkPalindrome(int danger,int n){
        if(danger == n){
            System.out.println("Number is palindrome..");
        }else{
            System.out.println("Number is not palindrome..");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        //n = 123
        int rev  = reverse(n);
        // //rev = 321
        System.out.println("Rev value is"+rev);
        checkPalindrome(rev,n);
    }
}

