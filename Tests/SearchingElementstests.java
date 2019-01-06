package by.epam.javatraining.ValeriiaAmialchenia.maintask01.tests;

import by.epam.javatraining.ValeriiaAmialchenia.maintask01.Logic;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.NullArrayException;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.ZeroLengthArrayException;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Tests for searching elements in a given array by Linear and Binary methods of search.
 *
 * @version 1.0 26 Dec 2018
 * @version 2.0 06 Jan 2019
 * @author Valeriia Amialchenia
 */
public class SearchingElementstests {

    @Test
    public void linearSearchElement1() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {2, 4, 5, 6, 1};
        assertEquals(0, Logic.searchElementLinear(arrayIn, 2));
    }

    @Test
    public void linearSearchElement2() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {2, 4, 5, 6, 1};
        assertEquals(-1, Logic.searchElementLinear(arrayIn, 7));
    }

    @Test
    public void linearSearchElement3() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {6};
        assertEquals(0, Logic.searchElementLinear(arrayIn, 6));
    }

    @Test
    public void linearSearchElement4() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = new int[]{0, 0, 0};
        Logic.searchElementLinear(arrayIn, 1);
    }

    @Test
    public void linearSearchElement5() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = null;
        assertNull(arrayIn);
    }

    @Test
    public void binarySearchElement1() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {-1, 25, 10, 4};
        int[] sortedArray = Logic.bubbleSort(arrayIn);
        assertEquals(1,
                Logic.searchElementBinary(sortedArray, 4));
    }

    @Test
    public void binarySearchElement2() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {1, 25, 10, 4};
        int[] sortedArray = Logic.bubbleSort(arrayIn);
        assertEquals(0,
                Logic.searchElementBinary(sortedArray, 1));
    }

    @Test
    public void binarySearchElement3() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = new int[]{0, 0, 0};
        Logic.searchElementBinary(arrayIn, 1);
    }

    @Test
    public void binarySearchElement4() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = null;
        assertNull(arrayIn);
    }

}
