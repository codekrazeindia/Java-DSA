public class PalindromeArray {
    public static void main(String[] args) {
        // check whether this array is palindrome or not..
        int[] arr = { 1, 2, 2, 3, 2, 2, 1 };
        // L -> R
        // R -> L
        int i = 0;
        int j = arr.length - 1;
        boolean p = true;
        while (i < j) {
            if (arr[i] != arr[j]) {
                p = false;
                break;
            }
            i++;
            j--;
        }
        if(p){
            System.out.println("Array is palindrome..");
        }else{
            System.out.println("Array is not palindrome..");
        }
    }
}
