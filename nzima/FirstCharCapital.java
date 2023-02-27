package com.itbullz.nzima;
import java.util.Arrays;
import java.util.Scanner;

public class FirstCharCapital {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		
		
		System.out.println(firstCharToTitleCase(userInput));
	}

	public static String firstCharToTitleCase(String string) {
		String[] old_words = string.split("\\s");
		String[] formatted_words = new String[old_words.length];
		for(int i = 0; i< old_words.length;i++) {
			char first = Character.toUpperCase(old_words[i].charAt(0));
			String others= (old_words[i].substring(1)).toLowerCase();
			String formed = first + others;
			formatted_words[i]= formed;
			
			
		}
		return String.join(" ",formatted_words);
	}
}
