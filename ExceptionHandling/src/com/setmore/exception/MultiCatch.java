package com.setmore.exception;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a[]= new int[5];
			a[5]=30;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
