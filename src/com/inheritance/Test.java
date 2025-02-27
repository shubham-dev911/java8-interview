package com.inheritance;

class A {
	int x = 10;
	int y = 20;
	final int h;
	
	public A() {
		h = 10;
		
	}

	public void m1() {
		System.out.println("m1--A");

	}

	public void m2() {
		System.out.println("m2--A");
	}
}

class B extends A {
	int x = 30;
	int z = 40;

	public void m1() {
		System.out.println("m1--B");

	}

	public void m3() {
		System.out.println("m2--B");
	}

}

public class Test {

	public static void main(String[] args) {
		A a = new B();
		a.m2();
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println();

		int d = 'g';
		System.out.println(d);
	}
}
