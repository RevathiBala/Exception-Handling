package com.setmore.exception;

import java.io.IOException;

public class UnCheckedException {
	void m(){ // checked exception cannot propagate using throw
//		throw new IOException("device error");
	}
	void n(){
		m();
	}
	void p(){
		try{
		n();
		}
		catch(Exception e){
			System.out.println("exception");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnCheckedException un = new UnCheckedException();
		un.p();
	}

}
