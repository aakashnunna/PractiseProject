package com.aakash.lambda;

public interface IDefaultExampleA {

	public void saySomething();

	default public void sayHi() {
		System.out.println("Hi from InterfaceA");
	}

	public static void staticMethodinINterface() {
		System.out.println(" I am HULK. You cant override me.");
	}

}
