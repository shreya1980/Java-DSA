package com.shreya;
import java.util.*;

public class Table {
	public static void printTable(int n) {
		int table;
		for(int i=1;i<=10;i++) {
			table = n*i;
			System.out.println(table);
			
		}
		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printTable(n);

	}

}
