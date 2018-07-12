package com.aakash.lambda.referenceMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// Reference To An Instance Method Of A Particular Object
// Syntax is containingObject::instanceMethodName
public class ReferenceToInstanceMethodOAPO {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("David");
		names.add("Richard");
		names.add("Samuel");
		names.add("Rose");
		names.add("John");
		
		// Lambda Form
		ReferenceToInstanceMethodOAPO.printNames(names, x -> System.out.println(x));

		// Method Reference
		// Since System.out is an instance of type PrintStream, we then call the println method of the instance.
		ReferenceToInstanceMethodOAPO.printNames(names, System.out::println);

	}

	
	// Consumer<T> : Represents an operation that accepts a single input argument and returns no result.
	
	private static void printNames(List<String> list, Consumer<String> c) {
		list.forEach(x -> c.accept(x));
	}
	
}