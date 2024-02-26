package com.exercise1;
import java.util.*;

public class Power {
	public static int printSolution(int x,int n) {
		int result = 1;
		for(int i=0;i<n;i++) {
			result = result*x;
			
		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		printSolution(x,n);

	}

}
