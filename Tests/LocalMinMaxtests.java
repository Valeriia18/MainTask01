package by.epam.javatraining.ValeriiaAmialchenia.maintask01.tests;

import by.epam.javatraining.ValeriiaAmialchenia.maintask01.Logic;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.NullArrayException;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.ZeroLengthArrayException;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Tests for searching for the index of first local minimums or maximums in a given array.
 *
 * @version 1.0 26 Dec 2018
 * @version 2.0 06 Jan 2019
 * @author Valeriia Amialchenia
 */
public class LocalMinMaxtests {

    @Test
    public void findLocalMax1() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {-1, 0, -3, 3, 1, 6};
        assertEquals(1, Logic.findLocalMax(arrayIn));
    }

    @Test
    public void findLocalMax2() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {15, 3};
        assertEquals(-1, Logic.findLocalMax(arrayIn));
    }

    @Test
    public void findLocalMax3() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {3};
        assertEquals(-1, Logic.findLocalMax(arrayIn));
    }

    @Test
    public void findLocalMax4() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = new int[]{0, 0, 0};
        Logic.findLocalMax(arrayIn);
    }

    @Test
    public void findLocalMax5() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {-4, -1, -7};
        assertEquals(1, Logic.findLocalMax(arrayIn));
    }

    @Test
    public void findLocalMax6() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = null;
        assertNull(arrayIn);
    }

    @Test
    public void findLocalMin1() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {5, 10, 3, 12};
        assertEquals(2, Logic.findLocalMin(arrayIn));
    }

    @Test
    public void findLocalMin2() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {-1, -100, -10};
        assertEquals(1, Logic.findLocalMin(arrayIn));
    }

    @Test
    public void findLocalMin3() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {-7, -4};
        assertEquals(-1, Logic.findLocalMin(arrayIn));
    }

    @Test
    public void findLocalMin4() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {7, 4};
        assertEquals(-1, Logic.findLocalMin(arrayIn));
    }

    @Test
    public void findLocalMin5() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {7};
        assertEquals(-1, Logic.findLocalMin(arrayIn));
    }

    @Test
    public void findLocalMin6() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {0, 0, 5, 25, 15, 20, 0};
        assertEquals(4, Logic.findLocalMin(arrayIn));
    }

    @Test
    public void findLocalMin7() throws NullArrayException, ZeroLengthArrayException {
      int[] arrayIn = null;
        assertNull(arrayIn);
    }
     @Test
    public void findLocalMin8() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = new int[]{0, 0, 0};
        Logic.findLocalMin(arrayIn);
    }
    
}
