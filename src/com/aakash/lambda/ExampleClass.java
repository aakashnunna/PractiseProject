package com.aakash.lambda;

import java.util.ArrayList;
import java.util.List;

public class ExampleClass {
	

	public static void main(String[] args) {


		// Multiple parameters in lambda expression
		IExample iE = (text1, text2) -> {

			return text1.equalsIgnoreCase(text2);
		};
		boolean output = iE.compare("Aa", "AA");
		System.out.println("Out Put : " + output);

		// Multiple parameters with data type in lambda expression
		IExample iE_inclusing_DataType = (String text1, String text2) -> {

			return text1.equalsIgnoreCase(text2);
		};
		boolean output2 = iE_inclusing_DataType.compare("Aa", "AA");
		System.out.println("Out Put : " + output2);

		
		// Lambda Expression Foreach loop

		List<String> list = new ArrayList<String>();
		list.add("ankit");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");

		list.forEach((n) -> {
			System.out.println(n);
		});
		
		
		
		// Lambda Expression Example: Creating Thread
		
		Runnable r2 = () -> {
			System.out.println("Thread Running.");
		};
		
		Thread t1 = new Thread(r2);
		
		t1.start();
		

		
		
		

	}



}
