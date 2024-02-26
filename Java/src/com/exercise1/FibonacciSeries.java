package com.exercise1;
import java.util.*;

public class FibonacciSeries {
	public static void printFSeries(int n) {
		int a=0;
		int b=1;
		System.out.print(a + " ");
		if(n>1) {
			for(int i=2;i<=n;i++) {
				System.out.print(b+" ");
				int fib = b;
				b=a+b;
				a=fib;
			}
			System.out.println();
			return;
		}
			
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printFSeries(n);

	}

}
