package com.ahmad.demo;

public class Test {

	// main method
	public static void main(String[] args) {
		Test test = new Test();
		int result = test.add(10, 20);
		System.out.println("Result  : "+result);
	}
	public int add(int a, int b){
		System.out.println(a+" : "+b);
		return a+b;
	}
	
}
