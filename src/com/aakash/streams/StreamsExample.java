package com.aakash.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String args[]) {

		List<String> list_Str = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> filtered = list_Str.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("filtered " + filtered);

		Random random = new Random();
		random.ints().parallel().limit(10).forEach(System.out::println);

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		// get list of unique squares
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println("squaresList " + squaresList);

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		// get count of empty string
		long count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("count " + count);

		List<String> strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> filtered2 = strings2.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println("Filtered 2 List: " + filtered2);
		String mergedString = strings2.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged 2 String: " + mergedString);
		
		

	}

}
