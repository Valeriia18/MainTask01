/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.ValeriiaAmialchenia.maintask01.model;

import by.epam.javatraining.ValeriiaAmialchenia.maintask01.NullArrayException;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.ZeroLengthArrayException;

/*
 Class IncreasingDecreasingArray implements logic of checking if elements of array are incresing or decreasing;

      @version 1.0 26 Dec 2018
      @version 2.0 06 Jan 2019
      @version 3.0 13 Jan 2019
  @author Valeriia Amialchenia
 */

public class IncreasingDecreasingArray {
     public static boolean isIncreasingSequence(int[] arrayIn) throws NullArrayException, ZeroLengthArrayException {
        boolean result = false;
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {
            for (int i = 1; i < arrayIn.length; i++) {
                if (arrayIn[i] > arrayIn[i - 1]) {
                    result = true;
                } else {
                    return false;
                }
            }
        }
        return result;
    }

    public static boolean isDecreasingSequence(int[] arrayIn) throws NullArrayException, ZeroLengthArrayException {
        boolean result = false;
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {
            for (int i = 1; i < arrayIn.length; i++) {

                if (arrayIn[i] < arrayIn[i - 1]) {
                    result = true;
                } else {
                    return false;
                }
            }
        }
        return result;
    }
}
