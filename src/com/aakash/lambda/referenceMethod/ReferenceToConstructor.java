package com.aakash.lambda.referenceMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// Syntax is ClassName::new
public class ReferenceToConstructor {

	/**
	 * @param args the command line arguments
	 * 
	 */
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(4, 9, 16, 25, 36);
		
		// Lambda Form
		List<Double> squaredNumbers1 = ReferenceToConstructor.findSquareRoot(numbers,  x -> new Integer(x));
		System.out.println("Square root of numbers = " + squaredNumbers1);
		
		// Method Reference
		List<Double> squaredNumbers2 = ReferenceToConstructor.findSquareRoot(numbers, Integer::new);
		System.out.println("Square root of numbers = " + squaredNumbers2);
	}

	
	// Function: The Function interface has an abstract method apply which takes argument of type T and returns a result of type R.
	private static List<Double> findSquareRoot(List<Integer> list, Function<Integer, Integer> f) {
		
		List<Double> result = new ArrayList<Double>();
		
		list.forEach(x -> result.add(Math.sqrt(f.apply((Integer) x))));
		
		return result;
	}
	
}