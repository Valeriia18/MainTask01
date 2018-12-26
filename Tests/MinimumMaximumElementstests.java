package by.epam.javatraining.ValeriiaAmialchenia.maintask01.tests;

import by.epam.javatraining.ValeriiaAmialchenia.maintask01.Logic;
import org.junit.Test;
import static org.junit.Assert.*;


/*
 * Tests for searching maximum/minimum elements of a given array.
 *
 * @version 1.0 26 Dec 2018
 * @author Valeriia Amialchenia
 */
public class MinimumMaximumElementstests {

    @Test
    public void findMax1() {
        int[] arrayIn = {5, -68, 92, 105, -1};
        assertEquals(105, Logic.findMaxElement(arrayIn));
    }

    @Test
    public void findMax2() {
        int[] arrayIn = {100, 8, 20, 2};
        assertEquals(100, Logic.findMaxElement(arrayIn));
    }

    @Test
    public void findMax3() {
        int[] arrayIn = {};
        assertEquals(-1, Logic.findMaxElement(arrayIn));
    }

    @Test
    public void findMax4() {
        int[] arrayIn = null;
        assertEquals(-1, Logic.findMaxElement(arrayIn));
    }

    @Test
    public void findMin1() {
        int[] arrayIn = {100, 56, 468, 123, 0};
        assertEquals(0, Logic.findMinElement(arrayIn));
    }

    @Test
    public void findMin2() {
        int[] arrayIn = {-1, -504, -36, -89, -3};
        assertEquals(-504, Logic.findMinElement(arrayIn));
    }

    @Test
    public void findMin3() {
        int[] arrayIn = {143, 562, 13, 78, 1};
        assertEquals(1, Logic.findMinElement(arrayIn));
    }

    @Test
    public void findMin4() {
        int[] arrayIn = {13};
        assertEquals(13, Logic.findMinElement(arrayIn));
    }

    @Test
    public void findMin5() {
        int[] arrayIn = {};
        assertEquals(-1, Logic.findLocalMax(arrayIn));
    }

    @Test
    public void findMin6() {
        int[] arrayIn = null;
        assertEquals(-1, Logic.findLocalMax(arrayIn));
    }
}
