package com.setmore.exception;

public class SampleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a=20;
			int b=20/0;
			System.out.println(b);
		}
		catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
	}

}
