package com.itbullz.nzima;

public class StringFormatting {

	public static void main(String[] args) {
		String greetings = "hello, %s dear. how is your %s ?";
		String firstname = "Nzima";
		String time ="Morning";
		String formatted = String.format(greetings, firstname,time);
		System.out.println(formatted);
	}

}
