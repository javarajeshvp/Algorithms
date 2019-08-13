package com.vp.algo.sort;

import com.vp.utils.Helper;
import com.vp.utils.Printer;
import com.vp.utils.TestData;

public class ASelectionSort {
	
	public static void sortAsc(int array[]) {
		for (int i = 0; i < array.length-1; i++) { // Iterate from index 1 to end of array
			int minIndex=i;
			for (int j = i+1;j<array.length;j++){
				if(array[minIndex] > array[j]){
					minIndex = j;
				}
			}
			Helper.swap(array, i, minIndex);
		}

	}
	public static void sortDsc(int array[]) {
		for (int i = 0; i < array.length-1; i++) { // Iterate from index 1 to end of array
			int minIndex=i;
			for (int j = i+1;j<array.length;j++){
				if(array[minIndex] < array[j]){  // Only change
					minIndex = j;
				}
			}
			Helper.swap(array, i, minIndex);
	
		}

	}
	
	public static void main(String[] args) {
		int array[]=TestData.INT_ARRAY;
		System.out.println("Original Array ");
		Printer.print(array);
		
		sortAsc(array);
		System.out.println("Sorted Array - Asc ");
		Printer.print(array);
		
		System.out.println("Sorted Array - Dsc ");
		sortDsc(array);
		Printer.print(array);

	}
}
