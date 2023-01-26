package hometask16;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int[] arr1 = Sorting.init(180_000);
        int[] arr2 = Sorting.init(120_000);
        int[] arr3 = Sorting.init(100_000_000);

        long start1 = System.currentTimeMillis();
        Sorting.bubbleSort(arr1);
        long finish1 = System.currentTimeMillis();
        System.out.println(finish1 - start1);
        long start2 = System.currentTimeMillis();
        Sorting.shakeSort(arr2);
        long finish2 = System.currentTimeMillis();
        System.out.println(finish2 - start2);
        long start3 = System.currentTimeMillis();
        Sorting.quickSort1(arr3);
        long finish3 = System.currentTimeMillis();
        System.out.println(finish3 - start3);

    }
}
