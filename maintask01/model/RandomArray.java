package by.epam.javatraining.ValeriiaAmialchenia.maintask01.model;

import java.util.Random;
/*
 Class RandomArray implements logic of filling array with random values of a given length and boundary of elements values

 
      @version 1.0 26 Dec 2018
      @version 2.0 06 Jan 2019
      @version 3.0 13 Jan 2019
  @author Valeriia Amialchenia
 */
public class RandomArray {

    private static final int ARRAY_LENGTH = 5;
    private static final int ARRAY_VALUES_LIMIT = 1000;
    private static final Random RANDOM = new Random();

    public static int [] createRandomArray () {

        int[] myArray = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            myArray[i] = RANDOM.nextInt(ARRAY_VALUES_LIMIT);
        }
        return myArray;
    }
}
