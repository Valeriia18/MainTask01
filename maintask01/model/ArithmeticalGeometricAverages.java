
package by.epam.javatraining.ValeriiaAmialchenia.maintask01.model;

import by.epam.javatraining.ValeriiaAmialchenia.maintask01.NullArrayException;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.ZeroLengthArrayException;

/*
 Class ArithmeticalGeometricAverages implements logic of counting arithmetical and geometric average;

      @version 1.0 26 Dec 2018
      @version 2.0 06 Jan 2019
      @version 3.0 13 Jan 2019
  @author Valeriia Amialchenia
 */

public class ArithmeticalGeometricAverages {
    public static double CountArithmeticalAverage(int[] arrayIn) throws NullArrayException, ZeroLengthArrayException {
        double result = 0;
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {
            for (int i = 0; i < arrayIn.length; i++) {
                result += arrayIn[i];

            }
            result = result / arrayIn.length;
        }
        return result;
    }

    public static double CountGeometricAverage(int[] arrayIn) throws NullArrayException, ZeroLengthArrayException {
        double result = 1;
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {
            //result = arrayIn[0];
            for (int i = 0; i < arrayIn.length; i++) {
                result = result * arrayIn[i];
            }
            if (result > 0) {
                return Math.pow(result, 1.0 / arrayIn.length);
            } else {
                return result = -1;
            }
        }
    }
}
