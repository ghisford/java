package com.itbullz.nzima;



public class StringComparison {
	
	public static void main(String[] args) {
		System.out.println("===== String comparison =====");
		System.out.println();
		
		String s = " hello ";
		String s2 = " hello ";
		System.out.println("s == s2: " + (s == s2));					// true
		
		String s3 = new String(" hello ");
//		false bse we donot use the existing values in the string pool.
		System.out.println("s == s3: " + (s == s3));					// false
		System.out.println("s.equals(s3): " + s.equals(s3)); 			// true
//		true bse intern makes s3 look for "hello" in the string pool
		System.out.println("s == s3.intern(): " + (s == s3.intern()));	// true
		
		String firstName = "Andrii";
		String firstName2 = "andrii";
		System.out.println("firstName.equals(firstName2): " 
							+ firstName.equals(firstName2));// false
//		true bse we have ignored the case
		System.out.println("firstName.equalsIgnoreCase(firstName2): " 
							+ firstName.equalsIgnoreCase(firstName2)); 	// true
		
		
	}

}