package com.setmore.exception;

public class SampleProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		String s = null;
		int a =s.length();
		System.out.println(a);
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		System.out.println("rest of the code");
	}

}
