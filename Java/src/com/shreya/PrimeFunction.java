package com.shreya;
import java.util.*;

public class PrimeFunction {
	public static void isPrimeOrNot(int n) {
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				System.out.println("Not Prime");
				return;
			}
			else {
				System.out.println("Prime");
				return;

			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		isPrimeOrNot(n);

	}

}
