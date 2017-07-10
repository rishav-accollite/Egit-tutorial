package org.accolite.example;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class TestClass.
 */
public class TestClass {
	
	/**
	 * The main method.
	 *
	 * @param arg the arguments
	 */
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any two numbers:");
		int a=input.nextInt();
		int b=input.nextInt();
		printSum(a,b);
		printDiff(a,b);
		printProd(a,b);
	}

	/**
	 * Prints the product of two numbers.
	 *
	 * @param a the first input paramter
	 * @param b the second input paramter
	 */
	private static void printProd(int a, int b) {
		System.out.println("Product is "+(a*b));
		
	}

	/**
	 * Prints the difference of two numbers.
	 *
	 * @param a the first input paramter
	 * @param b the second input paramter
	 */
	private static void printDiff(int a, int b) {
		System.out.println("Difference is "+(a-b));
	}

	/**
	 * Prints the sum of two numbers.
	 *
	 * @param a the first input paramter
	 * @param b the second input paramter
	 */
	private static void printSum(int a, int b) {
		System.out.println("Sum is "+(a+b));
	}
}
