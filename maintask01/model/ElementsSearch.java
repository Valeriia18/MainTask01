/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.ValeriiaAmialchenia.maintask01.model;

import by.epam.javatraining.ValeriiaAmialchenia.maintask01.NullArrayException;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.ZeroLengthArrayException;

/*
 Class ElementsSearch implements logic of searching elements of array by multiple kinds of search (binary, linear);

      @version 1.0 26 Dec 2018
      @version 2.0 06 Jan 2019
      @version 3.0 13 Jan 2019
  @author Valeriia Amialchenia
 */
public class ElementsSearch {
     public static int searchElementLinear(int[] arrayIn, int element) throws NullArrayException, ZeroLengthArrayException {
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {
            for (int i = 0; i < arrayIn.length; i++) {
                if (arrayIn[i] == element) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int searchElementBinary(int[] arrayIn, int element) throws NullArrayException, ZeroLengthArrayException {
        int[] sortedArray = AraySorting.bubbleSort(arrayIn);

        int i = -1;
        if (arrayIn == null) {
            throw new NullArrayException();
        } else if (arrayIn.length == 0) {
            throw new ZeroLengthArrayException();
        } else {

            int min = 0;
            int max = sortedArray.length;
            int mid;

            while (min < max) {

                mid = (min + max) / 2;

                if (element == sortedArray[mid]) {
                    i = mid;
                    break;
                } else {
                    if (element <= sortedArray[mid]) {
                        max = mid;
                    } else {
                        min = mid + 1;
                    }
                }

            }
        }
        return i;
    }
}
