package com.exercise1;
import java.util.*;

public class CircumferenceOfCircle {
	public static float printCircumference(float r) {
		float ans = 2*r*3.14f;
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		printCircumference(r);
		

	}

}
