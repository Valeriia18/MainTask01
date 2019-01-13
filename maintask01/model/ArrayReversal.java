/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.ValeriiaAmialchenia.maintask01.model;

import by.epam.javatraining.ValeriiaAmialchenia.maintask01.NullArrayException;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.ZeroLengthArrayException;

/*
 Class ArrayReversal implements logic of reversing array;

      @version 1.0 26 Dec 2018
      @version 2.0 06 Jan 2019
      @version 3.0 13 Jan 2019
  @author Valeriia Amialchenia
 */
public class ArrayReversal {

    public static int[] reverseArray(int[] arrayIn) throws NullArrayException, ZeroLengthArrayException {
        int arrayCopy[] = arrayIn.clone();
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {
            for (int i = 0; i < (arrayCopy.length / 2); i++) {
                arrayCopy[i] += arrayIn[arrayCopy.length - 1 - i]; //  a = a+b
                arrayCopy[arrayCopy.length - 1 - i] = arrayCopy[i] - arrayCopy[arrayIn.length - 1 - i];   //  b = a-b
                arrayCopy[i] -= arrayCopy[arrayCopy.length - 1 - i]; //  a = a-b
            }
        }
        return arrayCopy;
    }
}
