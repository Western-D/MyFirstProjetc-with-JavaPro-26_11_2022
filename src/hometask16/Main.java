package hometask16;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int lenght = 100_000_000;
        int[] arr = Sorting.init(lenght);
        int[] arr1 = Arrays.copyOf(arr, lenght);
        int[] arr2 = Arrays.copyOf(arr, lenght);
        int[] arr3 = Arrays.copyOf(arr, lenght);

        long start1 = System.currentTimeMillis();
        Sorting.quickSort1(arr1);
        long finish1 = System.currentTimeMillis();
        System.out.println(finish1 - start1);
        long start2 = System.currentTimeMillis();
        Sorting.quickSort1(arr2);
        long finish2 = System.currentTimeMillis();
        System.out.println(finish2 - start2);
        long start3 = System.currentTimeMillis();
        Sorting.quickSort1(arr3);
        long finish3 = System.currentTimeMillis();
        System.out.println(finish3 - start3);

    }
}
