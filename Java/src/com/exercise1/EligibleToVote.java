package com.exercise1;
import java.util.*;

public class EligibleToVote {
	public static void printEligibility(int age) {
		if(age>=18) {
			System.out.println("Eligible to Vote");
			return;
		}
		else {
			System.out.println("Not Eligible to Vote");
			return;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		printEligibility(age);

	}

}
