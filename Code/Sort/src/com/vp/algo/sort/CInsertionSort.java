package com.vp.algo.sort;

import com.vp.utils.*;

public class CInsertionSort {

	public static void sortAsc(int array[]) {
		for (int i = 1; i < array.length; i++) { // Iterate from index 1 to end of array
			for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
				Helper.swap(array, j , j-1);
			}
		}

	}
	public static void sortDsc(int array[]) {
		for (int i = 1; i < array.length; i++) { // Iterate from index 1 to end of array
			for (int j = i; j > 0 && array[j - 1] < array[j]; j--) { // Only difference here between Asc & Dsc
				Helper.swap(array, j , j-1);
	
			}
		}

	}
	public static void main(String[] args) {
		int array[]=TestData.INT_ARRAY;
		Printer.print(array);
		
		sortAsc(array);
		System.out.println("Sorted Array - Asc ");
		Printer.print(array);
		
		System.out.println("Sorted Array - Dsc ");
		sortDsc(array);
		Printer.print(array);

	}

}
