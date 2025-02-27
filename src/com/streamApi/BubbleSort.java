package com.streamApi;

public class BubbleSort {
	
	public static void main(String[] args){
		
		compareInt();
		compareString();
		
	}

	public static void compareInt(){
		int[] a = {36,29,12,19,16,7};
		int temp;
		for(int i=0;i<a.length;i++) {
			int flag=0;
			for(int j=0;j<a.length-1-i;j++) //for effectiveness we have added (-i) so that to reduce unnecessary iterations
			{
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if (flag==0) {
			break;	
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void compareString() {
		String[] a= {"deepak","sumit","mahesh","ramesh"};
		
		String temp;
		int flag = 0;
		
		for(int i=0;i<a.length;i++) {	
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j].compareTo(a[j+1])>0) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
					flag = 1;
				}
			}
			if(flag==0) {
				break;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	
	}
}
