package com.vp.algo.fib;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Fibonacci {

	public static boolean isPerfectSquare(double no) {
		boolean output = false;
		double x = Math.sqrt(no);
		if ( (x * x) == no) {
			output = true;
		}
		return output;
	}

	// Fibnocci no only if 5n^2-4 or 5n^2+4 a perfect square
	public static boolean isFibonacciNo(double no) {

		boolean output = false;
		double x= (5*no*no)-4;
		double y= (5*no*no)+4;
		
		if (isPerfectSquare(x) || isPerfectSquare(y)) {
			output = true;
		}
		return output;
	}

	public static List<Integer> getFirstMaxX(int max) {
		// f(n) = f(n-1)+f(n-2);

		List<Integer> output = new ArrayList<Integer>();
		// 0 , 1,1,2,3,5,8,13,21,34, 55
		int fib1 = 0;
		int fib2 = 1;
		int a = 0;
		while (max > fib1) {
			// Printer.print(fib1, ','); // 0,1,1,2,
			output.add(fib1);
			a = fib1 + fib2; // 1,2,3,
			fib1 = fib2; // 1,1,2,
			fib2 = a; // 1,2,3
		}
		return output;
	}

	public static List<Integer> getFirstCountX(int count) {

		List<Integer> output = new ArrayList<Integer>();
		// 0 , 1,1,2,3,5,8,13,21,34, 55
		int fib1 = 0;
		int fib2 = 1;
		int a = 0;
		for (int i = 1; i < count; i++) {
			// Printer.print(fib1, ','); // 0,1,1,2,
			output.add(fib1);
			a = fib1 + fib2; // 1,2,3,
			fib1 = fib2; // 1,1,2,
			fib2 = a; // 1,2,3
		}
		return output;
	}

	public static void main(String[] args) {

		List<Integer> output1 = getFirstCountX(20);
		System.out.println(output1);
		 for(double d:output1) {
			System.out.println( d +":" +isFibonacciNo(d));
		}

	}

}
