package com.trickyQuestions;

public class ThreadDemo extends Thread {

	int start;
	int end;

	public ThreadDemo(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for (int i = start; i < end; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
			i++;
		}

	}

	public static void main(String[] args) {
		ThreadDemo odd = new ThreadDemo(1, 50);
		ThreadDemo even = new ThreadDemo(2, 50);
		odd.setName("odd");
		even.setName("even");

		odd.run();
		even.run();
	}
}
