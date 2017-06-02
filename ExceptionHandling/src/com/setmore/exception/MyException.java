package com.setmore.exception;

public class MyException extends Exception{
	static int acctno[]={101,102,103};
	static String name[]={"revathibala","meena","vikky"};
	private static int bal[] ={10000, 12000, 5600, 999, 1100};
	
	MyException(){
		System.out.println("Default constructor");
	}
	MyException(String str){
		super(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			for(int i=0;i<5;i++){
				if(bal[i]<1000){
					MyException e = new MyException("Balance is less 1000");
					try {
						throw e;
					} catch (MyException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
