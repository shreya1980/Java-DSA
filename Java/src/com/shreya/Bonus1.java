package com.shreya;
import java.util.*;

public class Bonus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean isPrime = true;
		for(int i=2;i<num/2;i++) {
			
			if(num%i == 0) {
				isPrime = false;
				break;
			}		
		}
		
		if(isPrime) {
			if(num==1) {
				System.out.println("This is neither prime nor composite");
			}
			else {
				System.out.println("This is prime number");
			}
		}
		else {
			System.out.println("This is not a prime number");
		}

	}

}
