public class CountDigits {
    public static void main(String[] args) {
        int num = 5236;
        //output = 6325
        int count = 0;
        for (int i = num; i > 0;) {
             i /= 10;
            count += 1;
        }
        System.out.println("Your count is:" + count);
    }
}
