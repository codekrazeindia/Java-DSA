public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        //output = 6325
        int rev = 0;
        int rem = 0;
        for (int i = num; i > 0;) {
            rem = i%10;
            rev = rev * 10 + rem;
             i /= 10;
        }
        System.out.println("Your count is:" + rev);
    }
}

