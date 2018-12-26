package by.epam.javatraining.ValeriiaAmialchenia.maintask01.tests;

import by.epam.javatraining.ValeriiaAmialchenia.maintask01.Logic;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Tests for searching for the index of first local minimums or maximums in a given array.
 *
 * @version 1.0 26 Dec 2018
 * @author Valeriia Amialchenia
 */
public class LocalMinMaxtests {

    @Test
    public void findLocalMax1() {
        int[] arrayIn = {-1, 0, -3, 3, 1, 6};
        assertEquals(1, Logic.findLocalMax(arrayIn));
    }

    @Test
    public void findLocalMax2() {
        int[] arrayIn = {15, 3};
        assertEquals(-1, Logic.findLocalMax(arrayIn));
    }

    @Test
    public void findLocalMax3() {
        int[] arrayIn = {3};
        assertEquals(-1, Logic.findLocalMax(arrayIn));
    }

    @Test
    public void findLocalMax4() {
        int[] arrayIn = {0, 0, 0};
        assertEquals(-1, Logic.findLocalMax(arrayIn));
    }

    @Test
    public void findLocalMax5() {
        int[] arrayIn = {-4, -1, -7};
        assertEquals(1, Logic.findLocalMax(arrayIn));
    }

    @Test
    public void findLocalMax6() {
        int[] arrayIn = {};
        assertEquals(-1, Logic.findLocalMax(arrayIn));
    }

    @Test
    public void findLocalMax7() {
        int[] arrayIn = null;
        assertEquals(-1, Logic.findLocalMax(arrayIn));
    }

    @Test
    public void findLocalMin1() {
        int[] arrayIn = {5, 10, 3, 12};
        assertEquals(2, Logic.findLocalMin(arrayIn));
    }

    @Test
    public void findLocalMin2() {
        int[] arrayIn = {-1, -100, -10};
        assertEquals(1, Logic.findLocalMin(arrayIn));
    }

    @Test
    public void findLocalMin3() {
        int[] arrayIn = {-7, -4};
        assertEquals(-1, Logic.findLocalMin(arrayIn));
    }

    @Test
    public void findLocalMin4() {
        int[] arrayIn = {7, 4};
        assertEquals(-1, Logic.findLocalMin(arrayIn));
    }

    @Test
    public void findLocalMin5() {
        int[] arrayIn = {7};
        assertEquals(-1, Logic.findLocalMin(arrayIn));
    }

    @Test
    public void findLocalMin6() {
        int[] arrayIn = {0, 0, 5, 25, 15, 20, 0};
        assertEquals(4, Logic.findLocalMin(arrayIn));
    }

    @Test
    public void findLocalMin7() {
        int[] arrayIn = {};
        assertEquals(-1, Logic.findLocalMin(arrayIn));
    }

    @Test
    public void findLocalMin8() {
        int[] arrayIn = null;
        assertEquals(-1, Logic.findLocalMin(arrayIn));
    }
}
