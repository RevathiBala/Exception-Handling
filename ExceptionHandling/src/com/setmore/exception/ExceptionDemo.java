package com.setmore.exception;

import java.io.IOException;

class Parent{
	public void method() throws Exception{
		throw new Exception("valid");
	}
}
class Child extends Parent{
	public void method() throws ArithmeticException{
		System.out.println("child");
	}
}
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();
	}

}
