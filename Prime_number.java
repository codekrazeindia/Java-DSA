public class Prime_number {
    public static void main(String[] args) {
        int n = 6;
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("Number is prime..");
        } else {
            System.out.println("Number is not prime..");
        }
    }
}
