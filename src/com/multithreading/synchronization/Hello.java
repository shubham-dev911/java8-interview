package com.multithreading.synchronization;

public class Hello {
	
	public void display(String msg) {
		System.out.println("[");
		System.out.println(msg);
		System.out.println("]");
	}
	public synchronized static void main(String[] args) {
		Hello hello = new Hello();
		
		MyThread t1=new MyThread("Java", hello);
		MyThread t2=new MyThread("Classes", hello);
		
		t1.start();
		t2.start();
	}
}

class MyThread extends Thread{
	Hello hello;
	String msg;
	
	public MyThread(String msg, Hello hello) {
		this.msg=msg;
		this.hello=hello;
	}
	
	public void run() {
		hello.display(msg);
	}
	
	
}
