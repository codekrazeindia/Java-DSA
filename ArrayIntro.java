import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        // int[] marks = { 2, 3, 4, 5, 6, 8, 9, 6, 2, 4, 9 }; //
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sized of an array:");
        int m = sc.nextInt();
        int[] marks1 = new int[m]; // size define 0 0 0 0 0
        // index - this is the fix value for accessing the array element... it starts
        // from 0.
        // last index = arr.length - 1;
        // 0 1 2 3 4 = 5
        // marks1[0] = 12;
        // marks1[3] = 65;
        // marks1[4] = 31;
        // System.out.println(marks1[2]);

        for (int i = 0; i < m; i++) {
            System.out.println("Enter the  value for an array's index : " + i);
            int n = sc.nextInt();
            marks1[i] = n;
        }
        // for(int i = 0;i < marks1.length;i++){
        // System.out.print(marks1[i]+" ");
        // }
        // for each loop
        for (int num : marks1) {
            System.out.print(num + " ");
        }
    }
}
// Array : a collection of similar(homogenous) types of elements stored in
// contiguous memory.

// int marks = 5;
// int marks2 = 10;
// int marks3 = 6;
