package com.aakash.abstractexample;

import com.aakash.general.SampleInter;

public class Dog extends Animal {
	
	String dog = "nhi";

	@Override
	public void sound() {
		System.out.println("Makes Bow Bow Sound");
	}

	public static void main(String[] args) {

		Animal obj = new Dog();

		obj.eat();
		obj.sound();

		SampleInter ob = () -> System.out.println("jjhj");
		
		
		

	}
	
	protected void finalize() throws Throwable
	   {
	        System.out.println("Garbage collection is performed by JVM");
	   }
	

}

