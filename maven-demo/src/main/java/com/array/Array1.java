package com.array;

public class Array1 {
	
	public static void change(int y[]) {
		for(int counter=0; counter<y.length;counter++) {
			y[counter]=y[counter]+1;
		} 
		
	}

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
            change(array);
            for(int x: array)
            	System.out.println(x);
     			
	}

}
