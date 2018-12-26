
package by.epam.javatraining.ValeriiaAmialchenia.maintask01.tests;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.Logic;
import org.junit.Test;
import static org.junit.Assert.*;
/*
 * Tests for counting Arithmetical and Geometric Averages of elements of a given array.
 *
 * @version 1.0 26 Dec 2018
 * @author Valeriia Amialchenia
 */
public class ArithmeticalGeometricAveragestests {
     @Test
    public void getArithmeticAverage1() {
        int[] arrayIn = {1, 2, 3, 4, 5, 6, 7};
       assertEquals(4, Logic.CountArithmeticalAverage(arrayIn), 0.001);
       
    }
     @Test
    public void getArithmeticAverage2() {
        int[] arrayIn = {5, 4, 9, 10, 2, 1};
       assertEquals(5.166, Logic.CountArithmeticalAverage(arrayIn), 0.001);
       
    }

    @Test
    public void getArithmeticAverage3() {
        int[] arrayIn = {3, 9};
        assertEquals(6, Logic.CountArithmeticalAverage(arrayIn), 0.001);
    }
     @Test
    public void getArithmeticAverage4() {
        int[] arrayIn = {-8, -10};
        assertEquals(-9, Logic.CountArithmeticalAverage(arrayIn), 0.001);
    }
    
    @Test
    public void getArithmeticAverage5() {
        int[] arrayIn = {7, -10, 3, -16, 3};
        assertEquals(-2.6, Logic.CountArithmeticalAverage(arrayIn), 0.001);
    }

    @Test
    public void getGeometricAverage1() {
        int[] arrayIn = {1, 2, 3, 4, 5};
        assertEquals(2.605, Logic.CountGeometricAverage(arrayIn), 0.001);
    }

    @Test
    public void getGeometricAverage2() {
        int[] arrayIn = {-1, -3, -5};
        assertEquals(-1, Logic.CountGeometricAverage(arrayIn), 0.001);
    }

    @Test
    public void getGeometricAverage3() {
        int[] arrayIn = {3, 10, 2};
        assertEquals(3.914, Logic.CountGeometricAverage(arrayIn), 0.001);
}
    @Test
    public void getGeometricAverage4() {
        int[] arrayIn = {};
        assertEquals(-1, Logic.CountGeometricAverage(arrayIn), 0.001);
}
    @Test
    public void getGeometricAverage5() {
        int[] arrayIn = null;
        assertEquals(-1, Logic.CountGeometricAverage(arrayIn), 0.001);
}
}
