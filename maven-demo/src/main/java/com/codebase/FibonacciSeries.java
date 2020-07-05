package com.codebase;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
	   int n1, n2, n3, count;
	   Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the count which you want to print:");
              
	    count=scanner.nextInt();
	   
	    n1=1;
	    n2=1;
	    System.out.println(n1);
	    System.out.println(n2);
	    
	   
	    for(int i=2;i<count;i++) {
	    	n3=n2+n1;
	    	System.out.println(n3);
	    	n1=n2;
	    	n2=n3;
	    	
	  
	    }
	    System.out.println("End the loop");
	    
	} 

}
