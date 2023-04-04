package com.greatlearning.currencynotecount;

import java.util.Arrays;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Currency Note Denominations in the Country");
		int size = sc.nextInt();

		int currency[] = new int[size];

		System.out.println("Enter the denominations");
		for (int i = 0; i < size; i++)
			currency[i] = sc.nextInt();

		System.out.println("Before Sorting " + Arrays.toString(currency));
		MergeSort ms = new MergeSort();
		ms.sort(currency, 0, size - 1);
		System.out.println("After Sorting " + Arrays.toString(currency));

		System.out.println("Enter Total Amount");
		int amount = sc.nextInt();

		System.out.println("The minimum number of notes to be paid for the said amount:");
		NoteCount nc = new NoteCount();
		nc.counting(currency, amount);

	}
}