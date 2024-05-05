package Array;

import java.util.Arrays;

public class FindLargest {
    public static void main(String[] args) {
        int[] arr = { 70, 3, 5, 72, 2, 4, 10, 3 };
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        System.out.println("Largest number is " + largest);
    }
}
