package com.setmore.exception;

import java.io.IOException;

public class ThrowsExample {
	void p() throws IOException{
		throw new IOException("device error");
	}
	void n() throws IOException{
		p();
	}
	void m(){
		try {
			n();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			try {
				throw new IOException("device error");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExample t = new ThrowsExample();
		t.m();
	}

}
