package com.shreya;
import java.util.*;

public class Functions {
//	public static int calculateSum(int a,int b) {
//		int sum=a+b;
//		return sum;
//	}
	public static int calculateProduct(int a,int b) {
		int product=a*b;
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
//		int sum= calculateSum(a,b);
//		System.out.println("sum is- "+sum);
		
		int product= calculateProduct(a,b);
		System.out.println("product is- "+product);


	}

}
