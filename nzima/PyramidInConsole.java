package com.itbullz.nzima;

import java.util.Scanner;

public class PyramidInConsole {
    
    public static void main(String[] args) {
		System.out.print("Please, enter height of the pyramid: ");
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        for(int i = 1; i< num +1; i++){
        	
	        	for (int j = i;j>0;j--){
	        		System.out.printf("*");
	        	}
	        	System.out.printf("\n");
        }
		        
		for(int i = num;i>0 ; i--){
			
        	for (int j = i-1;j>0;j--){
        		System.out.printf("*");
        	}
        	System.out.printf("\n");
		 }
		

    }

}