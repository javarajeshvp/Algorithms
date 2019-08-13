package com.vp.algo.fib;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.vp.junit.base.Junit5TestCaseBase;

public class FibonacciTest  extends Junit5TestCaseBase{

	
	@Test
	void test(){
		List<Integer> output1 = Fibonacci.getFirstMaxX(4181);
		List<Integer> output2 = Fibonacci.getFirstCountX(20);
		Assertions.assertEquals(output1, output2);
	}
}

