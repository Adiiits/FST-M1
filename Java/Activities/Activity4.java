package activities;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

public class Activity4 {

    static int[] ascendingOrder(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            int key = a[i];
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;

        }
        return a;
    }

    public static void main(String[] args) {

        int[] arr = {9, 5, 1, 4, 3};
        System.out.println("unsorted array: "+ Arrays.toString(arr));

         int[]  sortedArr= ascendingOrder(arr);
            System.out.println("sorted array: "+ Arrays.toString(sortedArr));
    }
}
