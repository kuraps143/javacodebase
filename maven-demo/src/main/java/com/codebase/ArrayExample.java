package com.codebase;
import java.util.Arrays;

public class ArrayExample {
	
	public static void printArray(double[] array) {
		   for (int i = 0; i < array.length; i++) {
		      System.out.println("Elements from method:=="+array[i] + " ");
		   }
		}
	
	public static int[] intValuesList(int[] list) {
		int[] ar = {1,2,3};
		int[] rs = new int[10];
		
		int[] result = new int[list.length];
		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		      result[j] = list[i];
		      System.out.println("method int values"+result[j]);
		   }
		   
		
		   return result;
		}
		   public static void main(String[] args) {
		      double[] myList = {1.9, 2.9, 3.4, 3.5};
		      // Print all the array elements
		      for (int i = 0; i < myList.length; i++) {
		         System.out.println("elements from for loop:=="+myList[i] + " ");
		      }
		    
		     
		      
		   // Print all the array elements by for each loop
		      for (double element : myList) {
		         System.out.println("Elements from for each loop:=="+element);
		      }
		      
		      
		      printArray(myList);
		      
		      int[] intList = new int[3000];
		      
		      intList[0] = 1;
		      intList[1] = 2;
		      intList[2] = 3;
		      intValuesList(intList);//intList[0 1 2]= [1 2 3]
		      
		      // adding all the elements
		      double total = 0;
		      for (int i = 0; i < myList.length; i++) {
		         total += myList[i];
		      }
		      System.out.println("Total is :==" + total);
		      
		   }
		}
