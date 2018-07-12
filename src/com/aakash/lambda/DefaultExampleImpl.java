package com.aakash.lambda;

public class DefaultExampleImpl implements IDefaultExampleA, IDefaultExampleB {
	

	@Override
	public void saySomething() {
		
		System.out.println("I know. I will say something.");
		
	}

	@Override
	public void sayHi() {
		 System.out.println("implemetation of sayHi() in MyClass");
		 
		 IDefaultExampleA.super.sayHi();
		 
		 IDefaultExampleB.super.sayHi();
	}
	
	
	public static void main(String[] args) {
		
		DefaultExampleImpl defaulExample = new DefaultExampleImpl();
		
		defaulExample.sayHi();
		
		IDefaultExampleA.staticMethodinINterface();
		
	}
	

}
