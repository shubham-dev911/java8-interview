package com.streamApi;

public final class Immutable {

	final String pancardNumber;
	
	public Immutable(String pancardNumber) {
		this.pancardNumber=pancardNumber;
	}
	
	public String getPancardNumber() {
		return pancardNumber;
	}
}


	class Test1{
	
		public static void main(String[] args) {
			Immutable im = new Immutable("ABC123");
			String s1 =im.getPancardNumber();
			System.out.println(s1);
		}
}