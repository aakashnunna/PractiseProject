package com.aakash.lambda;

public interface IDefaultExampleB {

	default public void sayHi() {
		System.out.println("Hi from InterfaceB");
	}

}
