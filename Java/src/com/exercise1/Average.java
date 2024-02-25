package com.exercise1;
import java.util.*;

public class Average {
	public static float printAvg(float num1,float num2,float num3) {
		float avg = (num1+num2+num3)/2;
		System.out.println("Average is - "+avg);
		return avg;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers - ");

		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		float num3 = sc.nextFloat();
		printAvg(num1,num2,num3);


	}

}
