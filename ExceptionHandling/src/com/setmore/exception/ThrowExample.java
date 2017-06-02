package com.setmore.exception;

public class ThrowExample {
	static void validate(int age){
		if(age<18){
			throw new ArithmeticException("not valid");
		}
		else{
			System.out.println("it is valid");
		}
	}
	public static void main(String args[]){
		ThrowExample t = new ThrowExample();
		t.validate(10);
	}
}
