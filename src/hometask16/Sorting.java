package hometask16;

import java.util.Random;

public class Sorting {
    public static int[] init(int lenght) {
        int[] arr = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            arr[i] = new Random().nextInt(100);
        }
        return arr;
    }

    public static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1)
                System.out.print(", ");
        }
        System.out.println();
    }

    public static void shakeSort(int[] array) {
        int min = 0;
        int max = array.length - 1;
        int index = 0;
        boolean isSorted = false;

        while (!isSorted) {
            while (index < max) {
                if (array[index] > array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
                if (index + 1 == max) {
                    --max;
                    break;
                }
                ++index;
            }
            while (index > min) {
                if (array[index] < array[index - 1]) {
                    int temp = array[index];
                    array[index] = array[index - 1];
                    array[index - 1] = temp;
                }
                if (index - 1 == min) {
                    ++min;
                    break;
                }
                --index;
            }
            if (min == max) {
                isSorted = true;
            }
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void quickSort1(int[] array) {
        if (array.length > 2000)
            bigArray(array);
        else {
            int min = 0;
            int max = array.length - 1;
            while (min != max) {
                while (max > min) {
                    if (array[min] > array[max]) {
                        int temp = array[min];
                        array[min] = array[max];
                        array[max] = temp;
                        break;
                    }
                    --max;
                }
                if (min == max)
                    break;
                ++min;
                while (min < max) {
                    if (array[max] < array[min]) {
                        int temp = array[min];
                        array[min] = array[max];
                        array[max] = temp;
                        break;
                    }
                    ++min;
                }
            }
            if (min > 1 && array.length > 2) {
                int[] arr1 = new int[min];
                System.arraycopy(array, 0, arr1, 0, arr1.length);
                quickSort1(arr1);
                System.arraycopy(arr1, 0, array, 0, arr1.length);
            }
            if (min + 1 <= array.length - 2 && array.length > 2) {
                int[] arr2 = new int[array.length - min - 1];
                System.arraycopy(array, min + 1, arr2, 0, arr2.length);
                quickSort1(arr2);
                System.arraycopy(arr2, 0, array, min + 1, arr2.length);
            }
        }
    }

    private static void bigArray(int[] array){
        int halfOfArray = array.length / 2;
        int[] arr1 = new int[halfOfArray];
        int[] arr2 = new int[array.length - halfOfArray];
        System.arraycopy(array, 0, arr1, 0, arr1.length);
        System.arraycopy(array, halfOfArray, arr2, 0, arr2.length);
        quickSort1(arr1);
        quickSort1(arr2);
        int n = 0;
        int m = 0;
        for (int i = 0; i < array.length; i++) {
            if (m == arr2.length) {
                array[i] = arr1[n];
                ++n;
            } else if (n == arr1.length) {
                array[i] = arr2[m];
                ++m;
            } else if (arr1[n] > arr2[m]) {
                array[i] = arr2[m];
                ++m;
            } else {
                array[i] = arr1[n];
                ++n;
            }
        }
    }
}
