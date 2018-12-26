package by.epam.javatraining.ValeriiaAmialchenia.maintask01.tests;

import by.epam.javatraining.ValeriiaAmialchenia.maintask01.Logic;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Tests for reversing a given array (from the last element to the first one).
 *
 * @version 1.0 26 Dec 2018
 * @author Valeriia Amialchenia
 */
public class ReverseArraytests {

    @Test
    public void reverseArray1() {
        int[] arrayIn = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, Logic.reverseArray(arrayIn));
    }

    @Test
    public void reverseArray2() {
        int[] arrayIn = {-15};
        assertArrayEquals(new int[]{-15}, Logic.reverseArray(arrayIn));
    }

    @Test
    public void reverseArray3() {
        int[] arrayIn = {0, -150, - 74, -54, -76};
        assertArrayEquals(new int[]{-76, -54, -74, -150, 0}, Logic.reverseArray(arrayIn));
    }

    @Test
    public void reverseArray4() {
        int[] arrayIn = {};
        assertArrayEquals(null, Logic.reverseArray(arrayIn));
    }

    @Test
    public void reverseArray5() {
        int[] arrayIn = null;
        assertArrayEquals(null, Logic.reverseArray(arrayIn));
    }

}
