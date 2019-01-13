/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.ValeriiaAmialchenia.maintask01.model;

import by.epam.javatraining.ValeriiaAmialchenia.maintask01.NullArrayException;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.ZeroLengthArrayException;

/*
 Class ExtremeElements implements logic of searching maximum and minimum elements of array;

      @version 1.0 26 Dec 2018
      @version 2.0 06 Jan 2019
      @version 3.0 13 Jan 2019
  @author Valeriia Amialchenia
 */
public class ExtremeElements {
        public static int findMaxElement(int[] arrayIn) throws NullArrayException, ZeroLengthArrayException {
        int result = 0;
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {
            result = arrayIn[0];
            for (int i = 0; i < arrayIn.length; i++) {
                if (arrayIn[i] > result) {
                    result = arrayIn[i];
                }
            }
        }
        return result;
    }

    public static int findMinElement(int[] arrayIn) throws NullArrayException, ZeroLengthArrayException {
        int result = 0;
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {
            result = arrayIn[0];
            for (int i = 0; i < arrayIn.length; i++) {
                if (arrayIn[i] < result) {
                    result = arrayIn[i];
                }
            }
        }
        return result;
    }
}
