package com.itbullz.nzima;

import java.util.Scanner;

public class SumDigitsInNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
	}

	public static int sumDigitsInNumber(int number) {
		
		int sum = 0;
		String temp = Integer.toString(number);
		int[] arr = new int[temp.length()];
		
		for(int i = 0; i< arr.length;i++) {
			arr[i] = temp.charAt(i) - '0';
			sum += arr[i];
			
		}
		
	return sum;
	}
}