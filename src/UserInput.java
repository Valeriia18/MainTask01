package by.epam.javatraining.ValeriiaAmialchenia.maintask01;

import java.util.Scanner;
/*
 * Class UserInput implements the functionality of entring data from console 

 
  @version 1.0 26 Dec 2018
  @author Valeriia Amialchenia
 */

public class UserInput {
    public final static Scanner scan = new Scanner(System.in);
    public static int input(String msg) {
        System.out.println(msg);
        return scan.nextInt();
    }
}
