package com.codebase;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingWithScanner {

	public static void main(String args[]) {
 int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Mention the size array you want:");
		int n=s.nextInt();// reading the value 
		//size of an array
		int[] array= new int[n]; //declared the array with size
		
		//iterate the value in the until you want 
		
		for(int i=0; i<n;i++) {// running the loop to add the elemnetts into array based on the size
		     array[i]=s.nextInt();
		}
		
		for( int i : array) {
			sum=sum+i;
		}
	    System.out.println("sum="+sum);
	
	}
}