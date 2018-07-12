package com.aakash.general;

public class ExceptionHandling {

	static void employee(int age) throws MyOwnException {

		if (age < 10) {
			throw new MyOwnException("Not a valid age");
		}

	}

	public static void maina(String[] args) throws MyOwnException {

		int age = 6;

		ExceptionHandling.employee(age);

	}

	public static void main(String args[]) {
		int x = 0;
		int y = 10;
		
		try {
			int num = y / x;
			System.out.println("next-statement: Inside try block");
		} catch (Exception ex) {
			System.out.println("Exception Occurred");
		}
		
		System.out.println("next-statement: Outside of try-catch");
	}

}
