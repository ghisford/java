package com.itbullz.nzima;
import java.util.Arrays;

public class StringProcessor {
	public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator()
			+ "peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator()
			+ "james;Derek James;james@gmail.com" + System.lineSeparator() + "jackson;Walter Jackson;jackson@gmail.com"
			+ System.lineSeparator() + "gregory;Mike Gregory;gregory@yahoo.com";

	public static void main(String[] args) {
		System.out.println("===== Convert 1 demo =====");
		System.out.println(convert1(INPUT_DATA));

		System.out.println("===== Convert 2 demo =====");
		System.out.println(convert2(INPUT_DATA));
//		
	}

	public static String convert1(String input) {
		String[] all_details = input.split("\\n");
		String[] formatted = new String[all_details.length-1];

		for (int i = 1; i < all_details.length; i++) {
			String[] person_details = all_details[i].split(";");
			String first_name = person_details[0];
			String email = person_details[2];
			formatted[i-1] = first_name + "==>"+ email;	
		}

		return String.join("\n", formatted);
	}

	public static String convert2(String input) {
		String[] all_details2 = input.split("\\n");
		String[] formatted = new String[all_details2.length-1];

		for (int i = 1; i < all_details2.length; i++) {
			String[] person_details2 = all_details2[i].split(";");
			String full_name = person_details2[1];
			String email = person_details2[2];
			formatted[i - 1] = full_name + " (email:" + email + ")";
		}

		return String.join("\n", formatted);

	}

}
