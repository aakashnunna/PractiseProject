package com.aakash.lambda.referenceMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 What is Method References?
	It is a feature which is related to Lambda Expression. 
	It allows us to reference constructors or methods without executing them. 
	Method references and Lambda are similar in that they both require a target type that consist of a compatible functional interface.
 */

// Syntax is Class::staticMethodName

public class ReferenceToStaticMethodExample {

	/** * @param args the command line arguments */
	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16);
		
		// Lambda Form
		List<Integer> primeNumbers = ReferenceToStaticMethodExample
										.findPrimeNumbers(numbers, (number) -> ReferenceToStaticMethodExample.isPrime((int) number));
		System.out.println("Prime Numbers are " + primeNumbers);
		
		// Method Reference Form
		List<Integer> primeNumbers2 = ReferenceToStaticMethodExample.findPrimeNumbers(numbers, ReferenceToStaticMethodExample::isPrime);
		System.out.println("Prime Numbers are " + primeNumbers2);
		
	}

	public static boolean isPrime(int number) {
		if (number == 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	
	// java.util.function.Predicate is a functional interface that can be used as assignment target for lambda expression. 
	// The Predicate interface represents an operation that takes a single input and returns a boolean value.
	// Explanation : https://www.boraji.com/java-8-predicate-example
	
	public static List<Integer> findPrimeNumbers(List<Integer> list, Predicate<Integer> predicate) {

		List<Integer> sortedNumbers = new ArrayList<Integer>();
		
		list.stream().filter((i) -> (predicate.test(i))).forEach((i) -> {
			sortedNumbers.add(i);
		});
		
		return sortedNumbers;
	}
	
}