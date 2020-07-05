package com.codebase;

public class Loops {

	public static void main(String[] args) {

		int n = 50;

		System.out.println("Even number");		
		for (int y = 1; y <= n; y++) {
			if (y % 2 == 0) {
				System.out.print(y + " ");
			}
		}
		System.out.println();

		System.out.println("odd numbers");
		for (int x = 1; x <= n; x++) { 
			if (x % 2 !=0) {
				System.out.print(x + " ");
			} 
		}

	}
}

