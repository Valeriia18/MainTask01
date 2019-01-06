package by.epam.javatraining.ValeriiaAmialchenia.maintask01.tests;

import by.epam.javatraining.ValeriiaAmialchenia.maintask01.Logic;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.NullArrayException;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.ZeroLengthArrayException;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Tests for searching maximum/minimum elements of a given array.
 *
 * @version 1.0 26 Dec 2018
 * @version 2.0 06 Jan 2019
 * @author Valeriia Amialchenia
 */
public class MinimumMaximumElementstests {

    @Test
    public void findMax1() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {5, -68, 92, 105, -1};
        assertEquals(105, Logic.findMaxElement(arrayIn));
    }

    @Test
    public void findMax2() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {100, 8, 20, 2};
        assertEquals(100, Logic.findMaxElement(arrayIn));
    }

    @Test
    public void findMax3() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = new int[]{0, 0, 0};
        Logic.findMaxElement(arrayIn);
    }

    @Test
    public void findMax4() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = null;
        assertNull(arrayIn);
    }

    @Test
    public void findMin1() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {100, 56, 468, 123, 0};
        assertEquals(0, Logic.findMinElement(arrayIn));
    }

    @Test
    public void findMin2() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {-1, -504, -36, -89, -3};
        assertEquals(-504, Logic.findMinElement(arrayIn));
    }

    @Test
    public void findMin3() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {143, 562, 13, 78, 1};
        assertEquals(1, Logic.findMinElement(arrayIn));
    }

    @Test
    public void findMin4() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {13};
        assertEquals(13, Logic.findMinElement(arrayIn));
    }

    @Test
    public void findMin5() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = new int[]{0, 0, 0};
        Logic.findLocalMin(arrayIn);
    }

    @Test
    public void findMin6() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = null;
        assertNull(arrayIn);
    }
}
