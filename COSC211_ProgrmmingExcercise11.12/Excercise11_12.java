/****************************************************
 * COSC211 
 * Student Name:Sony Mekala
 * Programming Exercise 11.12
 * 
 ****************************************************/
package testing;

import java.util.ArrayList;
import java.util.Scanner;

public class Excercise11_12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// This creates a new arrayList
		ArrayList<Double> list = new ArrayList<Double>();

		// Prompt the user to enter 5 values
		System.out.println("Enter 5 double values :");
		for (int i = 0; i < 5; i++)
			list.add(input.nextDouble());

		// this sum(list) calls the function
		System.out.println("The sum is " + sum(list));

	}

	// This defines sum function
	public static double sum(ArrayList<Double> list) {
		double total = 0;

		for (int i = 0; i < list.size(); i++)
			total += list.get(i);

		return total;

	}

}
