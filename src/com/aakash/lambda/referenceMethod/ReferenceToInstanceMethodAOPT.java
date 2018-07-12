package com.aakash.lambda.referenceMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

// Reference To an Instance Method Of An Arbitrary Object Of A Particular Type
// Syntax is ContainingType::methodName
public class ReferenceToInstanceMethodAOPT {
	
	private static class Person {
		
		private final String name;
		private final int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@SuppressWarnings("unused")
		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
	}

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("Albert", 80));
		persons.add(new Person("Ben", 15));
		persons.add(new Person("Charlote", 20));
		persons.add(new Person("Dean", 6));
		persons.add(new Person("Elaine", 17));
		
		// Lambda Form
		List<Integer> allAges1 = ReferenceToInstanceMethodAOPT.listAllAges(persons, x -> x.getAge());
		System.out.println("Printing out all ages \n" + allAges1);
		
		// Method Reference
		List<Integer> allAges2 = ReferenceToInstanceMethodAOPT.listAllAges(persons, Person::getAge);
		System.out.println("Printing out all ages \n" + allAges2);
		
	}


	private static List<Integer> listAllAges(List<Person> person, Function<Person, Integer> f){
		
		 List<Integer> result = new ArrayList<Integer>();

		 person.forEach(x -> result.add(f.apply((Person) x)));

		 return result;
	}
	
}