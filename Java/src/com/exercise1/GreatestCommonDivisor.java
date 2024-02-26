package com.exercise1;

import java.util.*;

public class GreatestCommonDivisor {
	public static int printGCD(int n1, int n2) {
		while (n1 != n2) {
			if (n1 > n2) {
				n1 = n1 - n2;
			} else {
				n2 = n2 - n1;
			}
		}
		System.out.println("GCD is : " + n2);
		return n2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		printGCD(n1, n2);

	}

}
