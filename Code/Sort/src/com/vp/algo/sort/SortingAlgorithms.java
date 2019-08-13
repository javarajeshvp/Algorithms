package com.vp.algo.sort;

import com.vp.utils.Printer;
import com.vp.utils.TestData;

public class SortingAlgorithms {

	public static void selectionSortAsc(int[] array) {
		int size = array.length;
		int tmpMinIndex = 0;
		for (int outerLoop = 0; outerLoop < size - 1; outerLoop++) {
			// size-1 because there is no need to iterate to the last elements
			// which will be automatically sorted once rest are done
			tmpMinIndex = outerLoop;
			for (int innerLoop = tmpMinIndex + 1; innerLoop < size; innerLoop++) {
				// Ignore the sorted portion(so, Inner loop should start from
				// unsorted portion
				if (array[tmpMinIndex] > array[innerLoop]) {
					int tempVal = array[innerLoop];
					array[innerLoop] = array[tmpMinIndex];
					array[tmpMinIndex] = tempVal;
				}
			}
		}

	}

	public static void bubbleSortAsc(int[] array) {

		int size = array.length;
		for (int oLoop = 0; oLoop < size - 2; oLoop++) {
			for (int iLoop = 0; iLoop < size - 1; iLoop++) {
				if (array[iLoop] > array[iLoop + 1]) {
					int tempVal = array[iLoop];
					array[iLoop] = array[iLoop + 1];
					array[iLoop + 1] = tempVal;
				}

			}
		}
	}

	public static void insertionSortAsc(int[] array) {
		int size = array.length;

		for (int outerLoop = 1; outerLoop < size; outerLoop++) {
			for (int innerLoop = outerLoop; innerLoop > 0 && array[innerLoop - 1] > array[innerLoop]; innerLoop--) {
				int tempVal = array[innerLoop - 1];
				array[innerLoop - 1] = array[innerLoop];
				array[innerLoop] = tempVal;
			}
		}
	}

	private static void mergeSortAsc(int[] array, int lowIndex, int highIndex) {

		if (lowIndex < highIndex) {
			int middleIndex = (highIndex + lowIndex) / 2;

			mergeSortAsc(array, lowIndex, middleIndex);
			mergeSortAsc(array, middleIndex + 1, highIndex);
			merge(array, lowIndex, middleIndex, highIndex);
		}
	}

	private static void merge(int[] array, int lowIndex, int middleIndex, int highIndex) {
		int helperArray[]=new int[array.length];  
		for(int i=lowIndex;i<highIndex;i++){
			helperArray[i] =  array[i];
		}
		
		
	}

	public static void main(String[] args) {

		int array[] = TestData.INT_ARRAY;
		System.out.println("Original Array ");
		Printer.print(array);
		/*
		 * selectionSortAsc(array);
		 * System.out.println("Sorted Array using Selection Sort");
		 * Printer.print(array);
		 * 
		 * bubbleSortAsc(array);
		 * System.out.println("Sorted Array using Bubble Sort");
		 * Printer.print(array);
		 *
		 * insertionSortAsc(array);
		 * System.out.println("Sorted Array using Insertion Sort");
		 * Printer.print(array);
		 */
		int size = array.length;
		int lowIndex = 0;
		int highIndex = size - 1;
		mergeSortAsc(array, lowIndex, highIndex);
	}

}
