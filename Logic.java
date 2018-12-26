package by.epam.javatraining.ValeriiaAmialchenia.maintask01;

import java.util.Arrays;
import java.util.Random;

/*
 * Class Logic represent logic of:
- filling array with random values;
- searching maximum, minimum elements;
- searching local maximums and minimums;
- counting arithmetical and geometric average;
- reversing array;
- checking if elements are incresing or decreasing;
- searching elements by multiple kinds of search (binary, linear);
- sorting elements by multiple kinds of sort (bubble, shaker, insertion,
selection, quick, merge);

 
  @version 1.0 26 Dec 2018
  @author Valeriia Amialchenia
 */
public class Logic {

    public static int[] fillRandom(int N) {
        int[] myArray = new int[N];
        // switch to double type
        Random r1 = new Random();
        for (int i = 0; i < N; i++) {
            myArray[i] = r1.nextInt(1000);
        }
        return myArray;
    }

    public static int findMaxElement(int[] arrayIn) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return -1;
        }
        int result = arrayIn[0];

        for (int i = 0; i < arrayIn.length; i++) {
            if (arrayIn[i] > result) {
                result = arrayIn[i];
            }
        }
        return result;
    }

    public static int findMinElement(int[] arrayIn) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return -1;
        }
        int result = arrayIn[0];
        for (int i = 0; i < arrayIn.length; i++) {
            if (arrayIn[i] < result) {
                result = arrayIn[i];
            }
        }
        return result;
    }

    public static double CountArithmeticalAverage(int[] arrayIn) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return -1;
        }
        double result = 0;
        for (int i = 0; i < arrayIn.length; i++) {
            result += arrayIn[i];
        }
        if (arrayIn.length != 0) {
            result = result / arrayIn.length;
        }
        return result;
    }

    public static double CountGeometricAverage(int[] arrayIn) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return -1;
        }
        double result = 1;
        for (int i = 0; i < arrayIn.length; i++) {
            result = result * arrayIn[i];
        }
        if ((arrayIn.length != 0) & (result > 0)) {
            return Math.pow(result, 1.0 / arrayIn.length);
        } else {
            return result = -1;
        }
    }

    public static boolean isIncreasingSequence(int[] arrayIn) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return false;
        }
        boolean result = false;
        for (int i = 1; i < arrayIn.length; i++) {
            if (arrayIn[i] > arrayIn[i - 1]) {
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }

    public static boolean isDecreasingSequence(int[] arrayIn) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return false;
        }
        boolean result = false;
        for (int i = 1; i < arrayIn.length; i++) {

            if (arrayIn[i] < arrayIn[i - 1]) {
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }

    public static int findLocalMin(int[] arrayIn) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return -1;
        }
        for (int i = 1; i < arrayIn.length - 1; i++) {
            if (arrayIn[i] < arrayIn[i - 1] & arrayIn[i] < arrayIn[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public static int findLocalMax(int[] arrayIn) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return -1;
        }
        for (int i = 1; i < arrayIn.length - 1; i++) {
            if (arrayIn[i] > arrayIn[i - 1] & arrayIn[i] > arrayIn[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public static int[] reverseArray(int[] arrayIn) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return null;
        }
        for (int i = 0; i < (arrayIn.length / 2); i++) {
            arrayIn[i] += arrayIn[arrayIn.length - 1 - i]; //  a = a+b
            arrayIn[arrayIn.length - 1 - i] = arrayIn[i] - arrayIn[arrayIn.length - 1 - i];   //  b = a-b
            arrayIn[i] -= arrayIn[arrayIn.length - 1 - i]; //  a = a-b
        }
        return arrayIn;
    }

    public static int searchElementLinear(int[] arrayIn, int element) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return -1;
        }
        for (int i = 0; i < arrayIn.length; i++) {
            if (arrayIn[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int searchElementBinary(int[] arrayIn, int element) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return -1;
        }
        int[] sortedArray = Logic.bubbleSort(arrayIn);

        int i = -1;
        int min = 0;
        int max = sortedArray.length;
        int mid;

        while (min < max) {

            mid = (min + max) / 2;

            if (element == sortedArray[mid]) {
                i = mid;
                break;
            } else {
                if (element <= sortedArray[mid]) {
                    max = mid;
                } else {
                    min = mid + 1;
                }
            }

        }
        return i;
    }

    public static int[] bubbleSort(int[] arrayIn) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return null;
        }
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 1; j < arrayIn.length - i; j++) {
                if (arrayIn[j - 1] > arrayIn[j]) {
                    int temp = arrayIn[j - 1];
                    arrayIn[j - 1] = arrayIn[j];
                    arrayIn[j] = temp;
                }
            }
        }

        return arrayIn;
    }

    public static int[] shakerSort(int[] arrayIn) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return null;
        }
        boolean change = true;
        int start = 0;
        int end = arrayIn.length;

        while (change == true) {
            change = false;

            for (int i = start; i < end - 1; ++i) {
                if (arrayIn[i] > arrayIn[i + 1]) {
                    int temp = arrayIn[i];
                    arrayIn[i] = arrayIn[i + 1];
                    arrayIn[i + 1] = temp;
                    change = true;
                }
            }

            if (change == false) {
                break;
            }

            change = false;

            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                if (arrayIn[i] > arrayIn[i + 1]) {
                    int temp = arrayIn[i];
                    arrayIn[i] = arrayIn[i + 1];
                    arrayIn[i + 1] = temp;
                    change = true;
                }
            }

            start = start + 1;
        }

        return arrayIn;
    }

    public static int[] insertionSort(int[] arrayIn) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return null;
        }
        int[] sortedArray = new int[arrayIn.length];
        int destinationSize = 0;
        for (int n = 0; n < arrayIn.length; n++) {
            int insertIndex = 0;
            if (destinationSize > 0) {
                while (insertIndex < destinationSize
                        && sortedArray[insertIndex] < arrayIn[n]) {
                    insertIndex++;
                }
            }

            for (int m = destinationSize - 1; m >= insertIndex; m--) {
                sortedArray[m + 1] = sortedArray[m];
            }
            sortedArray[insertIndex] = arrayIn[n];
            destinationSize++;
        }
        return sortedArray;
    }

    public static int[] selectionSort(int[] arrayIn) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return null;
        }
        int min;
        int x;

        for (int index = 0; index < arrayIn.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < arrayIn.length; scan++) {
                if (arrayIn[scan] < arrayIn[min]) {
                    min = scan;
                }
            }

            x = arrayIn[min];
            arrayIn[min] = arrayIn[index];
            arrayIn[index] = x;
        }
        return arrayIn;
    }

    public static int[] mergeSort(int[] arrayIn) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return null;
        }
        if (arrayIn.length < 2) {
            return arrayIn;
        }
        int m = arrayIn.length / 2;
        int[] arr1 = Arrays.copyOfRange(arrayIn, 0, m);
        int[] arr2 = Arrays.copyOfRange(arrayIn, m, arrayIn.length);
        return subMergeSort(mergeSort(arr1), mergeSort(arr2));
    }
//merging two arrays into one sorted array

    public static int[] subMergeSort(int[] arr1, int arr2[]) {
        int n = arr1.length + arr2.length;
        int[] arr = new int[n];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < n; i++) {
            if (i1 == arr1.length) {
                arr[i] = arr2[i2++];
            } else if (i2 == arr2.length) {
                arr[i] = arr1[i1++];
            } else {
                if (arr1[i1] < arr2[i2]) {
                    arr[i] = arr1[i1++];
                } else {
                    arr[i] = arr2[i2++];
                }
            }
        }
        return arr;
    }

    public static int[] quickSort(int[] arrayIn) {
        if ((arrayIn == null) || (arrayIn.length == 0)) {
            return null;
        }
        subQuickSort(arrayIn, 0, arrayIn.length - 1);
        return arrayIn;
    }

    private static void subQuickSort(int[] arrayIn, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (arrayIn[i] <= arrayIn[cur])) {
                i++;
            }
            while (j > cur && (arrayIn[cur] <= arrayIn[j])) {
                j--;
            }
            if (i < j) {
                int temp = arrayIn[i];
                arrayIn[i] = arrayIn[j];
                arrayIn[j] = temp;
                if (i == cur) {
                    cur = j;
                } else if (j == cur) {
                    cur = i;
                }
            }
        }
        subQuickSort(arrayIn, start, cur);
        subQuickSort(arrayIn, cur + 1, end);
    }

}
