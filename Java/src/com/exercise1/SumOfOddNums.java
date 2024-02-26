package com.exercise1;
import java.util.*;


public class SumOfOddNums {
	public static void sumOdd(int n) {
		int sum=0;
		for(int i=n;i>=1;i--) {
			if(i%2==1) {
				sum = sum+i;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number - ");
		int n = sc.nextInt();
		sumOdd(n);

	}

}
