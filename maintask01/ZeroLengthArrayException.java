/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.ValeriiaAmialchenia.maintask01;

/*
    @version 1.0 26 Dec 2018
    @version 2.0 06 Jan 2019
  @author Valeriia Amialchenia
 */
public class ZeroLengthArrayException extends Exception {
    public ZeroLengthArrayException() {
        super("The length of array cannot be 0! ");
}
}
