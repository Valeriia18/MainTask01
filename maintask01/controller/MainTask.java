package by.epam.javatraining.ValeriiaAmialchenia.maintask01.controller;

import by.epam.javatraining.ValeriiaAmialchenia.maintask01.view.Printer;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.model.AraySorting;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.NullArrayException;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.ZeroLengthArrayException;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.model.ArithmeticalGeometricAverages;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.model.ArrayReversal;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.model.ElementsSearch;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.model.ExtremeElements;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.model.IncreasingDecreasingArray;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.model.LocalExtremeElements;
import by.epam.javatraining.ValeriiaAmialchenia.maintask01.model.RandomArray;
import java.util.Arrays;
import org.apache.log4j.Logger;

/*
    @version 1.0 26 Dec 2018
    @version 2.0 06 Jan 2019
    @version 3.0 13 Jan 2019
  @author Valeriia Amialchenia
 */
public class MainTask {

    private static Logger log = null;

    public static void main(String[] args) throws NullArrayException, ZeroLengthArrayException {
        log = Logger.getLogger(MainTask.class);
        //
        //Filling array with random values
        //
        int[] myArray = RandomArray.createRandomArray();

        log.info("Generated Array: \n" + Arrays.toString(myArray));
        //
        // Searching maximum and minimum elements;
        //
        log.info("Maximum element of array: " + ExtremeElements.findMaxElement(myArray));
        log.info("Minimum element of array: " + ExtremeElements.findMinElement(myArray));

        //
        // Counting arithmetical and geometric average;
        //
        log.info("ArithmeticalAverage: " + ArithmeticalGeometricAverages.CountArithmeticalAverage(myArray));
        log.info("GeometricAverage: " + ArithmeticalGeometricAverages.CountGeometricAverage(myArray));

        //
        // Checking if elements are incresing or decreasing;
        //
        log.info("Sequence of numbers is increasing: " + IncreasingDecreasingArray.isIncreasingSequence(myArray));
        log.info("Sequence of numbers is decreasing: " + IncreasingDecreasingArray.isDecreasingSequence(myArray));

        //
        // Searching local maximums and minimums;
        //
        int localMin = LocalExtremeElements.findLocalMin(myArray);
        int localMax = LocalExtremeElements.findLocalMax(myArray);
        log.info("The index of first local minimum is " + localMin);
        log.info("The index of first local maximum is " + localMax);
//            ConsolePrinter.printArray((localMin == -1) ? "No local minimums were found" : "The index of first local minimum is " + localMin);
//            ConsolePrinter.printArray((localMax == -1) ? "No local maximums were found" : "The index of first local maximum is " + localMax);

        //
        // Reversing array;
        //
        log.info("Reversed array: " + Arrays.toString(ArrayReversal.reverseArray(myArray)));
        log.info("Initial: " + Arrays.toString(myArray));

        //
        // Search input element by Linear Search
        //
        int LinearSearch = ElementsSearch.searchElementLinear(myArray, 340);

        log.info((LinearSearch != 340) ? "Element is NOT found" : "Element is found. Its index is " + LinearSearch);

        //
        // Search input element by Binary Search
        //
        int BinarySearch = ElementsSearch.searchElementBinary(myArray, 7);

        log.info((BinarySearch != 7) ? "Element is NOT found" : "Element is found. Its index is " + BinarySearch);

        //
        // Sorting array
        //
        log.info("Sorted array by Bubble Sort: " + Arrays.toString(AraySorting.bubbleSort(myArray)));

        log.info("Sorted array by Shaker Sort: " + Arrays.toString(AraySorting.shakerSort(myArray)));

        log.info("Sorted array by Insertion Sort: " + Arrays.toString(AraySorting.insertionSort(myArray)));

        log.info("Sorted array by Insertion Sort: " + Arrays.toString(AraySorting.selectionSort(myArray)));

        log.info("Sorted array by Merge Sort: " + Arrays.toString(AraySorting.mergeSort(myArray)));

        log.info("Sorted array by Quick Sort: " + Arrays.toString(AraySorting.quickSort(myArray)));

    }

}
