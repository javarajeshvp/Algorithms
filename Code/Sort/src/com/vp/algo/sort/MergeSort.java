package com.vp.algo.sort;

import com.vp.utils.Printer;
import com.vp.utils.TestData;

public class MergeSort {

	public static void sort(int array[]) {
		mergeSort(array, 0, array.length - 1);
	}

	public static void mergeSort(int array[], int low, int high) {
		if (low < high) {
			int middle = (low + high) / 2;
			mergeSort(array, low, middle);
			mergeSort(array, middle + 1, high);
			merge(array, low, middle, high);
		}
	}

	public static void merge(int array[], int low, int middle, int high) {
		int helperArray[] = new int[array.length];
		for (int i = low; i <= high; i++) {
			helperArray[i] = array[i];
		}
		int left = low;
		int curr = low;
		int right = middle + 1;
		while (left <= middle && right <= high) {
			if (helperArray[right] > helperArray[left]) { //For Desc if (helperArray[right] < helperArray[left]) {
				array[curr++] = helperArray[left++];
			} else {
				array[curr++] = helperArray[right++];
			}

		}
		while (left <= middle) {
			array[curr++] = helperArray[left++];
		}
	}

	public static void main(String[] args) {
	
		int array[]=TestData.INT_ARRAY;
		System.out.println("Original Array ");
		Printer.print(array);

		sort(array);
		System.out.println("Sorted Array - Asc ");
		Printer.print(array);
	}
}
