package by.epam.javatraining.ValeriiaAmialchenia.maintask01.tests;

import by.epam.javatraining.ValeriiaAmialchenia.maintask01.Logic;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Tests for searching elements in a given array by Linear and Binary methods of search.
 *
 * @version 1.0 26 Dec 2018
 * @author Valeriia Amialchenia
 */
public class SearchingElementstests {

    @Test
    public void linearSearchElement1() {
        int[] arrayIn = {2, 4, 5, 6, 1};
        assertEquals(0, Logic.searchElementLinear(arrayIn, 2));
    }

    @Test
    public void linearSearchElement2() {
        int[] arrayIn = {2, 4, 5, 6, 1};
        assertEquals(-1, Logic.searchElementLinear(arrayIn, 7));
    }

    @Test
    public void linearSearchElement3() {
        int[] arrayIn = {6};
        assertEquals(0, Logic.searchElementLinear(arrayIn, 6));
    }

    @Test
    public void linearSearchElement4() {
        int[] arrayIn = {};
        assertEquals(-1, Logic.searchElementLinear(arrayIn, 2));
    }

    @Test
    public void linearSearchElement5() {
        int[] arrayIn = null;
        assertEquals(-1, Logic.searchElementLinear(arrayIn, 2));
    }

    @Test
    public void binarySearchElement1() {
        int[] arrayIn = {-1, 25, 10, 4};
        int[] sortedArray = Logic.bubbleSort(arrayIn);
        assertEquals(1,
                Logic.searchElementBinary(sortedArray, 4));
    }

    @Test
    public void binarySearchElement2() {
        int[] arrayIn = {1, 25, 10, 4};
        int[] sortedArray = Logic.bubbleSort(arrayIn);
        assertEquals(0,
                Logic.searchElementBinary(sortedArray, 1));
    }

    @Test
    public void binarySearchElement3() {
        int[] arrayIn = {};
        assertEquals(-1, Logic.searchElementBinary(arrayIn, 1));
    }

    @Test
    public void binarySearchElement4() {
        int[] arrayIn = null;
        assertEquals(-1, Logic.searchElementBinary(arrayIn, 1));
    }

}
