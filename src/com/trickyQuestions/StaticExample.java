package com.trickyQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StaticExample {
	static int x = 10;
	static int y = 12;
	
	
	
	public static void main(String[] args) {
		StaticExample s1=new StaticExample();
		StaticExample s2=new StaticExample();
		
		s1.x +=10;
		s2.x +=20;
		
		System.out.println(x+x);
		
	}

}
