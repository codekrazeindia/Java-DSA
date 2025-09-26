public class ReverseArrayOptimized {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        // 1. Two pointers approach
        // {7,2,3,4,5,6,1};
        // {7,6,3,4,5,2,1};
        // {7,6,5,4,3,2,1};
        // space-optimized and time-optimized 7/2 = 3

        for(int i=0;)





        // int i = 0;
        // int j = arr.length - 1;
        // while (i < j) {
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     i++;
        //     j--;
        // }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
