public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        // output = {6,5,4,3,2,1};
        // only want to read in reverse order
        // for (int i = arr.length - 1; i >= 0; i--) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // Reverse an array using a new array...(space taking method..)
        int arr1[] = new int[arr.length];// 0-5
        // {6,0,0,0,0,0};
        int a = 0;
        int b = arr.length - 1;
        while (a < arr.length && b >= 0) {
            arr1[a] = arr[b];
            a++;
            b--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
