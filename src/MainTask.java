package by.epam.javatraining.ValeriiaAmialchenia.maintask01;

import java.util.Arrays;

/*
    @version 1.0 26 Dec 2018
    @version 2.0 06 Jan 2019
  @author Valeriia Amialchenia
 */
public class MainTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws  NullArrayException, ZeroLengthArrayException {
        //
        // User input of number of elements of array
        //

        int N = UserInput.input("Enter number of elements: ");

        //
        //Filling array with random values
        //
        int[] myArray = Logic.fillRandom(N);
        
        ConsolePrinter.printArray("Result of array: " + Arrays.toString(myArray));

        //
        // Searching maximum and minimum elements;
        //
        ConsolePrinter.printArray("Maximum element of array: " + Logic.findMaxElement(myArray));
        ConsolePrinter.printArray("Minimum element of array: " + Logic.findMinElement(myArray));

        //
        // Counting arithmetical and geometric average;
        //
        ConsolePrinter.printArray("ArithmeticalAverage: " + Logic.CountArithmeticalAverage(myArray));
        ConsolePrinter.printArray("GeometricAverage: " + Logic.CountGeometricAverage(myArray));

        //
        // Checking if elements are incresing or decreasing;
        //
        ConsolePrinter.printArray("Sequence of numbers is increasing: " + Logic.isIncreasingSequence(myArray));
        ConsolePrinter.printArray("Sequence of numbers is decreasing: " + Logic.isDecreasingSequence(myArray));

        //
        // Searching local maximums and minimums;
        //
        int localMin = Logic.findLocalMin(myArray);
        int localMax = Logic.findLocalMax(myArray);

        ConsolePrinter.printArray((localMin == -1) ? "No local minimums were found" : "The index of first local minimum is " + localMin);
        ConsolePrinter.printArray((localMax == -1) ? "No local maximums were found" : "The index of first local maximum is " + localMax);

        //
        // Reversing array;
        //
        ConsolePrinter.printArray("Reversed array: " + Arrays.toString(Logic.reverseArray(myArray)));

        //
        // Search input element by Linear Search
        //
        int LS = UserInput.input("Enter element to search (Linear): ");

        int LinearSearch = Logic.searchElementLinear(myArray, LS);

        ConsolePrinter.printArray((LinearSearch == -1) ? "Element is NOT found" : "Element is found. Its index is " + LinearSearch);

        //
        // Search input element by Binary Search
        //
        int BS = UserInput.input("Enter element to search (Binary): ");

        int BinarySearch = Logic.searchElementBinary(myArray, BS);

        ConsolePrinter.printArray((BinarySearch == -1) ? "Element is NOT found" : "Element is found. Its index is " + BinarySearch);

        //
        // Sorting array
        //
        ConsolePrinter.printArray("Sorted array by Bubble Sort: " + Arrays.toString(Logic.bubbleSort(myArray)));
        
        ConsolePrinter.printArray("Sorted array by Shaker Sort: " + Arrays.toString(Logic.shakerSort(myArray)));
        
        ConsolePrinter.printArray("Sorted array by Insertion Sort: " + Arrays.toString(Logic.insertionSort(myArray)));
        
        ConsolePrinter.printArray("Sorted array by Insertion Sort: " + Arrays.toString(Logic.selectionSort(myArray)));
        
        ConsolePrinter.printArray("Sorted array by Merge Sort: " + Arrays.toString(Logic.mergeSort(myArray)));
        
        ConsolePrinter.printArray("Sorted array by Quick Sort: " + Arrays.toString(Logic.quickSort(myArray)));


    }

}
