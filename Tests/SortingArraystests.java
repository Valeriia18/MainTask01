package by.epam.javatraining.ValeriiaAmialchenia.maintask01.tests;

import java.util.Random;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.Logic;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Tests for sorting elements in a given array by: 
- Bubble sort;
- Shaker sort;
- Insertion sort;
- Selection sort;
- Merge sort;
- Quick sort;

 *
 * @version 1.0 26 Dec 2018
 * @author Valeriia Amialchenia
 */
public class SortingArraystests {

    public static final Random RANDOM = new Random();

    @Test
    public void bubbleSort1() {
        int[] arrayIn = {6, 4, 1, 9, 4, 8, 3};
        assertArrayEquals(new int[]{1, 3, 4, 4, 6, 8, 9}, Logic.bubbleSort(arrayIn));
    }

    @Test
    public void bubbleSort2() {
        int[] arrayIn = {-2, -10, -3, 0, 6, 3};
        assertArrayEquals(new int[]{-10, -3, -2, 0, 3, 6}, Logic.bubbleSort(arrayIn));
    }

    @Test
    public void bubbleSort3() {
        int[] arrayIn = {-3, 0, 2};
        assertArrayEquals(new int[]{-3, 0, 2}, Logic.bubbleSort(arrayIn));
    }

    @Test
    public void bubbleSort4() {
        int[] arrayIn = {};
        assertArrayEquals(null, Logic.bubbleSort(arrayIn));
    }

    @Test
    public void bubbleSort5() {
        int[] arrayIn = null;
        assertArrayEquals(null, Logic.bubbleSort(arrayIn));
    }

    @Test
    public void shakerSort1() {
        int[] arrayIn = {-3, 0, 2};
        assertArrayEquals(new int[]{-3, 0, 2}, Logic.shakerSort(arrayIn));
    }

    @Test
    public void shakerSort2() {
        int[] arrayIn = {0, 4, 1, -5, 7};
        assertArrayEquals(new int[]{-5, 0, 1, 4, 7}, Logic.shakerSort(arrayIn));
    }

    @Test
    public void shakerSort3() {
        int[] arrayIn = {-4, -1, -125, 7};
        assertArrayEquals(new int[]{-125, -4, -1, 7}, Logic.shakerSort(arrayIn));
    }

    @Test
    public void shakerSort4() {
        int[] arrayIn = {};
        assertArrayEquals(null, Logic.shakerSort(arrayIn));
    }

    @Test
    public void shakerSort5() {
        int[] arrayIn = null;
        assertArrayEquals(null, Logic.shakerSort(arrayIn));
    }

    @Test
    public void insertionSort1() {
        int[] arrayIn = {10, 4, 2, 7};
        assertArrayEquals(new int[]{2, 4, 7, 10}, Logic.insertionSort(arrayIn));
    }

    @Test
    public void insertionSort2() {
        int[] arrayIn = {-10, 0, 3, 34, -5};
        assertArrayEquals(new int[]{-10, -5, 0, 3, 34}, Logic.insertionSort(arrayIn));
    }

    @Test
    public void insertionSort3() {
        int[] arrayIn = {4, 5, 6};
        assertArrayEquals(new int[]{4, 5, 6}, Logic.insertionSort(arrayIn));
    }

    @Test
    public void insertionSort4() {
        int[] arrayIn = {};
        assertArrayEquals(null, Logic.insertionSort(arrayIn));
    }

    @Test
    public void insertionSort5() {
        int[] arrayIn = null;
        assertArrayEquals(null, Logic.insertionSort(arrayIn));
    }

    @Test
    public void selectionSort1() {
        int[] arrayIn = {1, 4, 21, -4, 3};
        assertArrayEquals(new int[]{-4, 1, 3, 4, 21}, Logic.selectionSort(arrayIn));
    }

    @Test
    public void selectionSort2() {
        int[] arrayIn = {2, 0, 5};
        assertArrayEquals(new int[]{0, 2, 5}, Logic.selectionSort(arrayIn));
    }

    @Test
    public void selectionSort3() {
        int[] arrayIn = {-1, 2, 7};
        assertArrayEquals(new int[]{-1, 2, 7}, Logic.selectionSort(arrayIn));
    }

    @Test
    public void selectionSort4() {
        int[] arrayIn = {};
        assertArrayEquals(null, Logic.selectionSort(arrayIn));
    }

    @Test
    public void selectionSort5() {
        int[] arrayIn = null;
        assertArrayEquals(null, Logic.selectionSort(arrayIn));
    }

    @Test
    public void mergeSort1() {
        int[] arrayIn = {0, 5, 7, -9, -8, 4};
        assertArrayEquals(new int[]{-9, -8, 0, 4, 5, 7}, Logic.mergeSort(arrayIn));
    }

    @Test
    public void mergeSort2() {
        int[] arrayIn = new int[6];

        for (int i = 0; i < arrayIn.length; i++) {
            arrayIn[i] = RANDOM.nextInt();
        }

        assertArrayEquals(Logic.bubbleSort(arrayIn),
                Logic.mergeSort(arrayIn));
    }

    @Test
    public void mergeSort3() {
        int[] arrayIn = {};
        assertArrayEquals(null, Logic.mergeSort(arrayIn));
    }

    @Test
    public void mergeSort4() {
        int[] arrayIn = null;
        assertArrayEquals(null, Logic.mergeSort(arrayIn));
    }

    @Test
    public void quickSort1() {
        int[] arrayIn = {0, 5, 7, -9, -8, 4};
        assertArrayEquals(new int[]{-9, -8, 0, 4, 5, 7}, Logic.quickSort(arrayIn));
    }

    @Test
    public void quickSort2() {
        int[] arrayIn = {-1, 2, 7};
        assertArrayEquals(new int[]{-1, 2, 7}, Logic.quickSort(arrayIn));
    }

    @Test
    public void quickSort3() {
        int[] arrayIn = {2, 0, 5};
        assertArrayEquals(new int[]{0, 2, 5}, Logic.quickSort(arrayIn));
    }

    @Test
    public void quickSort4() {
        int[] arrayIn = {};
        assertArrayEquals(null, Logic.quickSort(arrayIn));
    }

    @Test
    public void quickSort5() {
        int[] arrayIn = null;
        assertArrayEquals(null, Logic.quickSort(arrayIn));
    }
}
