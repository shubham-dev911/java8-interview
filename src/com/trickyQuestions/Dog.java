package com.trickyQuestions;

import java.util.Iterator;

interface Animal2{
	public static void livesIn() {
		System.out.println("Animal2");
	}
}

public class Dog implements Animal,Animal2 {

	public void livesIn() {
		Animal.livesIn();
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
