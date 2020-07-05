package com.codebase;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		    int a=0;
            for(int i=0; i<5; i++) {
            	Scanner myObj = new Scanner(System.in);
            	 a = myObj.nextInt();
                a = a+a;
                System.out.println("Iteration : "+i + "a :"+ a);
            	

            }
            System.out.println(a);
	}

}
