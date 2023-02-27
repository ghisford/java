package com.itbullz.nzima;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		int[] intArray = new int[5];
		
	    int i = 0;
        while(i<5 && sc.hasNextInt()){
            int num = sc.nextInt();
            intArray[i] = num;
            	i++;
           
        }	
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		int maxInt =findMaxIntInArray(intArray) ;
		System.out.println(maxInt);
	}

	
	public static int findMaxIntInArray(int[] intArray) {
	    int maxInt = 0;
        for(int num: intArray){
            if (num > maxInt){
                maxInt = num;
            }
        }
        return maxInt;
	}
}

