package by.epam.javatraining.ValeriiaAmialchenia.maintask01.model;

import by.epam.javatraining.ValeriiaAmialchenia.maintask01.NullArrayException;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.ZeroLengthArrayException;
import java.util.Arrays;
import java.util.Random;

/*
 Class AraySorting implements logic of sorting elements of array by 
multiple kinds of sort (bubble, shaker, insertion, selection, quick, merge);

      @version 1.0 26 Dec 2018
      @version 2.0 06 Jan 2019
      @version 3.0 13 Jan 2019
  @author Valeriia Amialchenia
 */

public class AraySorting {

    public static int[] bubbleSort(int[] arrayIn) throws NullArrayException, ZeroLengthArrayException {
        int arrayCopy[] = arrayIn.clone();
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {
            for (int i = 0; i < arrayCopy.length; i++) {
                for (int j = 1; j < arrayCopy.length - i; j++) {
                    if (arrayCopy[j - 1] > arrayCopy[j]) {
                        int temp = arrayCopy[j - 1];
                        arrayCopy[j - 1] = arrayCopy[j];
                        arrayCopy[j] = temp;
                    }
                }
            }
        }
        return arrayCopy;
    }

    public static int[] shakerSort(int[] arrayIn) throws NullArrayException, ZeroLengthArrayException {
        int arrayCopy[] = arrayIn.clone();
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {
            boolean change = true;
            int start = 0;
            int end = arrayCopy.length;

            while (change == true) {
                change = false;

                for (int i = start; i < end - 1; ++i) {
                    if (arrayIn[i] > arrayCopy[i + 1]) {
                        int temp = arrayCopy[i];
                        arrayCopy[i] = arrayCopy[i + 1];
                        arrayCopy[i + 1] = temp;
                        change = true;
                    }
                }

                if (change == false) {
                    break;
                }

                change = false;

                end = end - 1;

                for (int i = end - 1; i >= start; i--) {
                    if (arrayCopy[i] > arrayCopy[i + 1]) {
                        int temp = arrayCopy[i];
                        arrayCopy[i] = arrayCopy[i + 1];
                        arrayCopy[i + 1] = temp;
                        change = true;
                    }
                }

                start = start + 1;
            }
        }
        return arrayCopy;
    }

    public static int[] insertionSort(int[] arrayIn) throws NullArrayException, ZeroLengthArrayException {
        int arrayCopy[] = arrayIn.clone();
        int[] sortedArray = new int[arrayCopy.length];
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {

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
        }
        return sortedArray;
    }

    public static int[] selectionSort(int[] arrayIn) throws NullArrayException, ZeroLengthArrayException {
        int arrayCopy[] = arrayIn.clone();
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {
            int min;
            int x;

            for (int index = 0; index < arrayCopy.length - 1; index++) {
                min = index;
                for (int scan = index + 1; scan < arrayCopy.length; scan++) {
                    if (arrayCopy[scan] < arrayCopy[min]) {
                        min = scan;
                    }
                }

                x = arrayCopy[min];
                arrayCopy[min] = arrayCopy[index];
                arrayCopy[index] = x;
            }
        }
        return arrayCopy;
    }

    public static int[] mergeSort(int[] arrayIn) throws NullArrayException, ZeroLengthArrayException {
        int arrayCopy[] = arrayIn.clone();
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {
            if (arrayCopy.length < 2) {
                return arrayCopy;
            }
            int m = arrayCopy.length / 2;
            int[] arr1 = Arrays.copyOfRange(arrayCopy, 0, m);
            int[] arr2 = Arrays.copyOfRange(arrayCopy, m, arrayCopy.length);

            return subMergeSort(mergeSort(arr1), mergeSort(arr2));
        }
    }

//merging two arrays into one sorted array
    public static int[] subMergeSort(int[] arr1, int arr2[]) throws NullArrayException, ZeroLengthArrayException {
      
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

    public static int[] quickSort(int[] arrayIn) throws NullArrayException, ZeroLengthArrayException {
        
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {
            subQuickSort(arrayIn, 0, arrayIn.length - 1);
            return arrayIn;
        }
    }

    private static void subQuickSort(int[] arrayIn, int start, int end) throws NullArrayException, ZeroLengthArrayException {
       
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
