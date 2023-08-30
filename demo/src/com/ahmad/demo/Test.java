package com.ahmad.demo;

public class Test {

	// Java main method
	public static void main(String[] args) {
		Test test = new Test();
		int result = test.add(10, 20);
		System.out.println("Result  : "+result);
	}
	// method will return the sum of two number's
	public int add(int a, int b){
		System.out.println(a+" : "+b);
		return a+b;
	}
	
}
