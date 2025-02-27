package com.multithreading;

public class MyRunnable implements Runnable {
	int start;
	int end;
	public MyRunnable(int start,int end) {
		// TODO Auto-generated constructor stub
		this.start=start;
		this.end=end;
	}

	@Override
	public void run() {
		for(int i=start;i<end;i++) {
			System.out.println(i);
			i++;
		}
		
	}

	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable(1,50);
		MyRunnable mr2=new MyRunnable(2,50);
		
		Thread t1=new Thread(mr);
		t1.start();
		Thread t2=new Thread(mr2);
		t2.start();
		
	}
}
