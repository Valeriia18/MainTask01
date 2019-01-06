package by.epam.javatraining.ValeriiaAmialchenia.maintask01.tests;

import java.util.Random;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.Logic;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.NullArrayException;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.ZeroLengthArrayException;
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
 * @version 2.0 06 Jan 2019
 * @author Valeriia Amialchenia
 */
public class SortingArraystests {

    public static final Random RANDOM = new Random();

    @Test
    public void bubbleSort1() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {6, 4, 1, 9, 4, 8, 3};
        assertArrayEquals(new int[]{1, 3, 4, 4, 6, 8, 9}, Logic.bubbleSort(arrayIn));
    }

    @Test
    public void bubbleSort2() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {-2, -10, -3, 0, 6, 3};
        assertArrayEquals(new int[]{-10, -3, -2, 0, 3, 6}, Logic.bubbleSort(arrayIn));
    }

    @Test
    public void bubbleSort3() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {-3, 0, 2};
        assertArrayEquals(new int[]{-3, 0, 2}, Logic.bubbleSort(arrayIn));
    }

    @Test
    public void bubbleSort4() throws  NullArrayException, ZeroLengthArrayException {
       int[] arrayIn = new int[]{0, 0, 0};
        Logic.bubbleSort(arrayIn);
    }

    @Test
    public void bubbleSort5() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = null;
        assertNull(arrayIn);
    }

    @Test
    public void shakerSort1() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {-3, 0, 2};
        assertArrayEquals(new int[]{-3, 0, 2}, Logic.shakerSort(arrayIn));
    }

    @Test
    public void shakerSort2() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {0, 4, 1, -5, 7};
        assertArrayEquals(new int[]{-5, 0, 1, 4, 7}, Logic.shakerSort(arrayIn));
    }

    @Test
    public void shakerSort3() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {-4, -1, -125, 7};
        assertArrayEquals(new int[]{-125, -4, -1, 7}, Logic.shakerSort(arrayIn));
    }

    @Test
    public void shakerSort4() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = new int[]{0, 0, 0};
        Logic.shakerSort(arrayIn);
    }

    @Test
    public void shakerSort5() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = null;
        assertNull(arrayIn);
    }

    @Test
    public void insertionSort1() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {10, 4, 2, 7};
        assertArrayEquals(new int[]{2, 4, 7, 10}, Logic.insertionSort(arrayIn));
    }

    @Test
    public void insertionSort2() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {-10, 0, 3, 34, -5};
        assertArrayEquals(new int[]{-10, -5, 0, 3, 34}, Logic.insertionSort(arrayIn));
    }

    @Test
    public void insertionSort3() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {4, 5, 6};
        assertArrayEquals(new int[]{4, 5, 6}, Logic.insertionSort(arrayIn));
    }

    @Test
    public void insertionSort4() throws  NullArrayException, ZeroLengthArrayException {
         int[] arrayIn = new int[]{0, 0, 0};
        Logic.insertionSort(arrayIn);
    }

    @Test
    public void insertionSort5() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = null;
        assertNull(arrayIn);
    }

    @Test
    public void selectionSort1() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {1, 4, 21, -4, 3};
        assertArrayEquals(new int[]{-4, 1, 3, 4, 21}, Logic.selectionSort(arrayIn));
    }

    @Test
    public void selectionSort2() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {2, 0, 5};
        assertArrayEquals(new int[]{0, 2, 5}, Logic.selectionSort(arrayIn));
    }

    @Test
    public void selectionSort3() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {-1, 2, 7};
        assertArrayEquals(new int[]{-1, 2, 7}, Logic.selectionSort(arrayIn));
    }

    @Test
    public void selectionSort4() throws  NullArrayException, ZeroLengthArrayException {
         int[] arrayIn = new int[]{0, 0, 0};
        Logic.selectionSort(arrayIn);
    }

    @Test
    public void selectionSort5() throws  NullArrayException, ZeroLengthArrayException {
         int[] arrayIn = null;
        assertNull(arrayIn);
    }

    @Test
    public void mergeSort1() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {0, 5, 7, -9, -8, 4};
        assertArrayEquals(new int[]{-9, -8, 0, 4, 5, 7}, Logic.mergeSort(arrayIn));
    }

    @Test
    public void mergeSort2() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = new int[6];

        for (int i = 0; i < arrayIn.length; i++) {
            arrayIn[i] = RANDOM.nextInt();
        }

        assertArrayEquals(Logic.bubbleSort(arrayIn),
                Logic.mergeSort(arrayIn));
    }

    @Test
    public void mergeSort3() throws  NullArrayException, ZeroLengthArrayException {
         int[] arrayIn = new int[]{0, 0, 0};
        Logic.mergeSort(arrayIn);
    }

    @Test
    public void mergeSort4() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = null;
        assertNull(arrayIn);
    }

    @Test
    public void quickSort1() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {0, 5, 7, -9, -8, 4};
        assertArrayEquals(new int[]{-9, -8, 0, 4, 5, 7}, Logic.quickSort(arrayIn));
    }

    @Test
    public void quickSort2() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {-1, 2, 7};
        assertArrayEquals(new int[]{-1, 2, 7}, Logic.quickSort(arrayIn));
    }

    @Test
    public void quickSort3() throws  NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {2, 0, 5};
        assertArrayEquals(new int[]{0, 2, 5}, Logic.quickSort(arrayIn));
    }

    @Test
    public void quickSort4() throws  NullArrayException, ZeroLengthArrayException {
         int[] arrayIn = new int[]{0, 0, 0};
        Logic.quickSort(arrayIn);
    }

    @Test
    public void quickSort5() throws  NullArrayException, ZeroLengthArrayException {
       int[] arrayIn = null;
        assertNull(arrayIn);
    }
}
