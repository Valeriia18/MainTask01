package by.epam.javatraining.ValeriiaAmialchenia.maintask01.model;

import by.epam.javatraining.ValeriiaAmialchenia.maintask01.NullArrayException;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.ZeroLengthArrayException;

/*
 Class LocalExtremeElements implements logic of searching local maximums and minimums of array;

      @version 1.0 26 Dec 2018
      @version 2.0 06 Jan 2019
      @version 3.0 13 Jan 2019
  @author Valeriia Amialchenia
 */
public class LocalExtremeElements {
     public static int findLocalMin(int[] arrayIn) throws NullArrayException, ZeroLengthArrayException {
        int result = -1;
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {
            for (int i = 1; i < arrayIn.length - 1; i++) {
                if (arrayIn[i] < arrayIn[i - 1] & arrayIn[i] < arrayIn[i + 1]) {
                    return i;
                }
            }
        }
        return result;
    }

    public static int findLocalMax(int[] arrayIn) throws NullArrayException, ZeroLengthArrayException {
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {
            for (int i = 1; i < arrayIn.length - 1; i++) {
                if (arrayIn[i] > arrayIn[i - 1] & arrayIn[i] > arrayIn[i + 1]) {
                    return i;
                }
            }
        }
        return -1;
    }
}