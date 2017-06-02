package com.setmore.exception;
class Myexception1 extends Exception{
	Myexception1(String s){
		super(s);
	}
}
public class CustomException {
	public static void validate(int age){
		if(age<18){
			try {
				throw new Myexception1("not valid");
			} catch (Myexception1 e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			System.out.println("valid to vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(13);
	}

}
