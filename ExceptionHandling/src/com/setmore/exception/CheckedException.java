package com.setmore.exception;

public class CheckedException {
	void m(){
		int data = 50/0;
	}
	void n(){
		m();
	}
	void p(){
		try{
			n();
		}
		catch(ArithmeticException e){
			System.out.println("exception");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckedException c = new CheckedException();
		c.p();
		System.out.println("normal flow");

	}

}
