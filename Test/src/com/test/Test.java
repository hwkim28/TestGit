package com.test;

public class Test {
	
	public static void main(String[] args) {
	
		int a[] = {5,2,3,6,5,8,4,9,};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		
		System.out.println(sum);
	}
}
