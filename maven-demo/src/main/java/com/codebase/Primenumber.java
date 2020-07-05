package com.codebase;

public class Primenumber {

	public static void main(String[] args) {
		int n=50;
		for(int x=2; x<=14; x++) {
			if(x%2==0) {
				System.out.print( x+ " ");
			}
			int i=0;
			System.out.println();
			do {
				i++;
				System.out.print(i+" ");
			}while(i<x);
			System.out.println();
		}
	}
}
