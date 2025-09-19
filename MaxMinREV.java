public class MaxMinRev {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 3, 9, 5, 4, 7 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_index = -1;
        int max_index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                max_index = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                min_index = i;
            }
        }
        int temp = arr[min_index];// 2
        arr[min_index] = arr[max_index]; // 9
        arr[max_index] = temp;
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
