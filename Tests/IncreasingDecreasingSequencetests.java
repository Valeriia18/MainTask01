package by.epam.javatraining.ValeriiaAmialchenia.maintask01.tests;

import by.epam.javatraining.ValeriiaAmialchenia.maintask01.Logic;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.NullArrayException;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.ZeroLengthArrayException;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Tests for defining whether a given array has numbers in ascending or descending order or not.
 *
 * @version 1.0 26 Dec 2018
 * @version 2.0 06 Jan 2019
 * @author Valeriia Amialchenia
 */
public class IncreasingDecreasingSequencetests {

    @Test
    public void isIncreasing1() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {4, 8, 9};
        assertEquals(true, Logic.isIncreasingSequence(arrayIn));
    }

    @Test
    public void isIncreasing2() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {15, 6, 2};
        assertEquals(false, Logic.isIncreasingSequence(arrayIn));
    }

    @Test
    public void isIncreasing3() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {3, 6, 8, 6, 7, 10};
        assertEquals(false, Logic.isIncreasingSequence(arrayIn));
    }

    @Test
    public void isIncreasing4() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = new int[]{0, 0, 0};
        Logic.isIncreasingSequence(arrayIn);
    }

    @Test
    public void isIncreasing5() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = null;
        assertNull(arrayIn);
    }

    @Test
    public void isDecreasing1() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {3, 2, 1};
        assertEquals(true, Logic.isDecreasingSequence(arrayIn));
    }

    @Test
    public void isDecreasing2() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = {100, 6, 3, 1, 15};
        assertEquals(false, Logic.isDecreasingSequence(arrayIn));
    }

    @Test
    public void isDecreasing3() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = new int[]{0, 0, 0};
        Logic.isDecreasingSequence(arrayIn);
    }

    @Test
    public void isDecreasing4() throws NullArrayException, ZeroLengthArrayException {
        int[] arrayIn = null;
        assertNull(arrayIn);
    }

}
