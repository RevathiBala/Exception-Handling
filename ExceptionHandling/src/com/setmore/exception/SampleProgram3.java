package com.setmore.exception;

public class SampleProgram3 {
	public static void main(String args[]){
		try{
			try{
				System.out.println("going to divide");
				int a =20;
				int b= a/0;
			}
			catch(ArithmeticException e){
				e.printStackTrace();
			}
				try{
					int a[] = new int[4];
					int i= a[4];
				}
				catch(ArrayIndexOutOfBoundsException e){
					e.printStackTrace();
				}
		}
		catch(Exception e){
			System.out.println("normal exception");
		}
		System.out.println("other tasks");
	}
	
}
