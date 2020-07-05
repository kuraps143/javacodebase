package com.codebase;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
	int value=0;
	int count=1;
		       for(int i=1; i<=5;i++) {
		    	   System.out.println("enter value " +count++ +" number");		    	  
		    	   Scanner myObject = new Scanner(System.in);
		    	   int num =myObject.nextInt();
		    	       value=value+num; 
		    	
		       }
		       System.out.println("final add up value "+value);
		
	}

}
