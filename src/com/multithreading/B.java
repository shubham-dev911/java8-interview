package com.multithreading;

public class B extends Thread{

	public void run() {
		A a=new A();
		
		if(currentThread().getName().equals("first")) {
			a.m1();
		}
		else {
			a.m2();
		}
	}
	
	public static void main(String[] args) {
		B b1=new B();
		b1.setName("first");
		b1.start();
		
		B b2=new B();
		b2.setName("second");
		b2.start();
	}
}
