package by.epam.javatraining.ValeriiaAmialchenia.maintask01.tests;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.Logic;
import org.junit.Test;
import static org.junit.Assert.*;
/*
 * Tests for defining whether a given array has numbers in ascending or descending order or not.
 *
 * @version 1.0 26 Dec 2018
 * @author Valeriia Amialchenia
 */

public class IncreasingDecreasingSequencetests {
    @Test
    public void isIncreasing1() {
        int[] arrayIn = {4, 8, 9};
        assertEquals(true, Logic.isIncreasingSequence(arrayIn));
    }

    @Test
    public void isIncreasing2() {
        int[] arrayIn = {15, 6, 2};
         assertEquals(false, Logic.isIncreasingSequence(arrayIn));
    }

    @Test
    public void isIncreasing3() {
        int[] arrayIn = {3, 6, 8, 6, 7, 10};
        assertEquals(false, Logic.isIncreasingSequence(arrayIn));
    }
    @Test
    public void isIncreasing4() {
        int[] arrayIn = {0, 0, 0, 0, 0};
        assertEquals(false, Logic.isIncreasingSequence(arrayIn));
    }
    @Test
    public void isIncreasing5() {
        int[] arrayIn = {};
        assertEquals(false, Logic.isIncreasingSequence(arrayIn));
}
    @Test
    public void isIncreasing6() {
        int[] arrayIn = null;
        assertEquals(false, Logic.isIncreasingSequence(arrayIn));
}
    @Test
    public void isDecreasing1() {
        int[] arrayIn = {3, 2, 1};
        assertEquals(true, Logic.isDecreasingSequence(arrayIn));
    }

    @Test
    public void isDecreasing2() {
        int[] arrayIn = {100, 6, 3, 1, 15};
        assertEquals(false, Logic.isDecreasingSequence(arrayIn));
    }

    @Test
    public void isDecreasing3() {
        int[] arrayIn = {0, 0, 0, 0};
        assertEquals(false, Logic.isDecreasingSequence(arrayIn));
}
     @Test
    public void isDecreasing4() {
        int[] arrayIn = {};
        assertEquals(false, Logic.isDecreasingSequence(arrayIn));
}
    @Test
    public void isDecreasing5() {
        int[] arrayIn = null;
        assertEquals(false, Logic.isDecreasingSequence(arrayIn));
}
    
}
