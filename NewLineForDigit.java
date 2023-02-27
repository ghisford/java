package com.itbullz.nzima;

import java.util.Scanner;

public class NewLineForDigit {
    
    public static void main(String[] args) {
		System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		char[] charArray = input.toCharArray();
		
		for(char num: charArray){
		    System.out.println(num);
		}
    }
   
}
