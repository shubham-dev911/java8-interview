package com.multithreading;

public class A {
	
	public void m1() {
		for(int i=0;i<50;i++) {
			System.out.println("m1---A");
		}
	}
	
	public void m2() {
		for(int i=0;i<50;i++) {
			System.out.println("m2---A");
		}
	}

}
