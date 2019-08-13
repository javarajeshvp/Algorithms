package com.vp.algo.binarysearch;

import com.vp.algo.sort.SortingAlgorithms;
import com.vp.utils.Printer;
import com.vp.utils.TestData;

public class BinarySearch {

	private static int search(int[] array, int findWhat) {
		int foundIndex = -1;
		int lowerIndex = 0;
		int upperIndex = array.length - 1;
		while (lowerIndex <= upperIndex) {
			int mid = (lowerIndex + upperIndex) / 2;
			if (array[mid] == findWhat) {
				return foundIndex;
			} else if (array[mid] > findWhat) {
				upperIndex = mid - 1;
			} else {
				lowerIndex = mid + 1;
			}
		}
		return foundIndex;
	}

	public static void main(String arg[]) {
		int array[] = TestData.INT_ARRAY;
		SortingAlgorithms.insertionSortAsc(array);
		System.out.println("Original Array ");
		Printer.print(array);
		System.out.println("Found Value @ index : " + search(array, 1000));
	}

}
