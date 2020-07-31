/*
**********************************************************************************************
	Author: Mike Piekarz

	Course Name: Programming Fundamentals	
	
	Date: 7/30/2020
	
	Semester: 2020 Summer

	Assignment Name: Programming Assignment2 - Figures
**********************************************************************************************
*/

// Import the Scanner class from the Java.util package
import java.util.Scanner;

public class Figures {

	// Declare and instantiate an object reference variable called scan
	static Scanner scan = new Scanner(System.in);
	// Create instance variable that is used for the size of each figure
	static int figureSize;

	public static void main(String[] args) {

		// Declare and instantiate a object reference variable called Figure
		//Figures figure = new Figures();

		// Variable will hold the associated option number user selected from the menu.
		int menuOption;

		// Create program header details (Program Name, Programmer Name, Program
		// Assignment #, & Welcome Intro) and display to the user
		System.out.println("Programming Fundamentals");
		System.out.println("Name: Mike Piekarz");
		System.out.println("PROGRAMMING ASSIGNMENT 2");
		System.out.print("\nEnter the size of the figure (odd number): ");

		// Initialize user input to the figureSize variable
		figureSize = scan.nextInt();

		// Check to ensure user inputed an odd number. If not, notify user and have them
		// re-enter another integer
		while ((figureSize % 2 == 0)) {
			System.out.println("Invalid figure size - must be an odd number");
			System.out.print("\nRenter the size of the figure: ");
			figureSize = scan.nextInt();
		}

		// Perform loop to display the menu options and prompt user to select an option
		do {
			System.out.println("\nMenu: \n1. Print box \n2. Print diamond \n3. Print X \n4. Quit Program");
			System.out.print("\nPlease select an option: ");

			// Initialize user input to the menuOption variable
			menuOption = scan.nextInt();
			System.out.println(); // Create blank space

			// Based upon users input call the various print methods to create the
			// respective figure
			if (menuOption == 1) {
				printBox(figureSize);
			} else if (menuOption == 2) {
				printDiamond(figureSize);
			} else if (menuOption == 3) {
				printX(figureSize);
			}
		} while (menuOption != 4); // If menu option selected is 4 then exist program
		{
			if (menuOption == 4) {
				scan.close();
				System.out.println("Good bye!");
				System.exit(0);
			}
		}
	}

	// --------------------------------------------------------------------------------------
	// printBiamond method that will be called if user selects menu option 1
	// --------------------------------------------------------------------------------------
	public static void printBox(int size) {
		// Draw out object to resemble a box.
		for (int row = 0; row < figureSize; row++) {
			for (int col = 0; col < figureSize; col++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}

	// --------------------------------------------------------------------------------------
	// printDiamond method that will be called if user selects menu option 2 
	// --------------------------------------------------------------------------------------
	public static void printDiamond(int size) {
		// Increase figure size by used to increase the column
		int newfigureSize = figureSize + 1;

		// Print the top half of the diamond
		for (int row = 0; row < ((newfigureSize) / 2); row++) {
			for (int col = 0; col < newfigureSize; col++) {
				if (col + row == ((newfigureSize - 1) / 2) || col - row == (newfigureSize / 2)) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// Print the bottom portion of diamond
		for (int row = (newfigureSize / 2); row < figureSize; row++) {
			for (int col = 0; col <= figureSize; col++) {
				if (row - col == ((newfigureSize - 1) / 2) || col + row == (figureSize + (figureSize) / 2)) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	// --------------------------------------------------------------------------------------
	// printX method that will be called if user selects menu option 3
	// --------------------------------------------------------------------------------------
	public static void printX(int size) {
		for (int row = 0; row < figureSize; row++) {
			for (int col = 0; col < figureSize; col++) {
				if (row == col || row + col == figureSize - 1) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
