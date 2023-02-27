package com.itbullz.nzima;

import java.util.Scanner;

public class EmptyRectangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();
		
		drawRectangle(height, width);
	}

	public static void drawRectangle(int height, int width) {
        
//		print the first row of starts
		for(int i = 0; i< width; i++){
			System.out.print("*");
		}
		
        for(int j= 0; j< height-1;j++) {
        	System.out.println(); 			//print new line
        	
        	if(j == height-2)				//print nothing for the last iteration
        		continue;
        	System.out.print("*");     		 // print the first star
        	for(int k = 0;k<width-2;k++) {
        	System.out.print(" ");			// print spaces between the stars
        	}
        	System.out.print("*");			//print the last star
        	
        }
        for(int i = 0; i< width; i++){
        	System.out.print("*");			//print the final row of stars
        }
	}

}
