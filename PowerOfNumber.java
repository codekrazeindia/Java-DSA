public class PowerOfNumber {
    public static void main(String[] args) {
        // n = 153
        // count = 3
        // 153 = 3^3
        // 15 = 5^3
        // 1 = 1^3
        // sum = 27 + 125 + 1 = 153
        // n == sum => arm otherwise not...
        // 3*3*3 = 27 , 5*5*5 = 125
        int a = 5; // n%10
        int b = 4; // count
        int power = 1;
        for (int i = 1; i <= b; i++) {
            power = power * a;
        }
        System.out.println("Power is : " + power);
    }

// Strong Number = 145;

// step 1: separate number by digits
// step 2: find digit factorial
// step 3: add up them

// 1! + 4! + 5!
// 1 + 24 + 120
// sum = 145
// sum == n



}
