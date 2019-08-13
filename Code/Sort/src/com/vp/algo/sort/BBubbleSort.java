package com.vp.algo.sort;

import com.vp.utils.*;

public class BBubbleSort {

	public static void sortAsc(int array[]) {
		for (int i = 1; i < array.length-1; i++) { // Iterate from index 1 to end of array
			for (int j = 0; j < array.length-i; j++) {
				if(array[j]> array[j+1]){
					Helper.swap(array,j,j+1);
				}

			}
		}

	}


	public static void main(String[] args) {
		int array[]=TestData.INT_ARRAY;
		Printer.print(array);
		
		sortAsc(array);
		System.out.println("Sorted Array - Asc ");
		Printer.print(array);
		
		//System.out.println("Sorted Array - Dsc ");
		///sortDsc(array);
		//Printer.print(array);

	}

}
