package com.vp.comparator;

import java.util.Arrays;

import com.vp.utils.Printer;
public class TestCustomComparator {

	
	public static void main(String arg[])
	{
		Integer [] arr = {99,9,23,21,91};
		System.out.println("before Sorting  ");
		Printer.print(arr);
		Arrays.sort(arr);
		System.out.println("after Sorting  ");
		Printer.print(arr);
		
	}
}
