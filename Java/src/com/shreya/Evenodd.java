package com.shreya;
import java.util.*;


public class Evenodd {
	public static void isEven(int num) {
		if(num%2==0) {
			System.out.println("Even");
			return;
		}
		else {
			System.out.println("Odd");
			return;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		isEven(num);

	}

}
