package com.itbullz.nzima;

import java.util.Scanner;
import java.util.Arrays;


public class ConvertDecimalToRoman {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		mainLoop: while (true) {
			System.out.print("Please, select mode. If you want to convert Roman "
					+ "numbers to decimal - type 'R2D' and press enter."
					+ System.lineSeparator()
					+ "If you want to convert decimal numbers to Roman - type 'D2R' and press enter: ");

			String mode = sc.next();
			if (mode.equalsIgnoreCase("R2D")) {
				while (true) {
					System.out.print("Please, enter Roman number you want to convert: ");
					String romanNumber = sc.next();
					if (isRomanNumberValid(romanNumber)) {
						System.out.println(roman2Decimal(romanNumber));
						break mainLoop;
					} 
					else {
						System.out.println("You entered invalid Roman number. "
								+ "Please, try one more time.");
						continue;
					}
				}
			} 
		if (mode.equalsIgnoreCase("D2R")) {
				while (true) {
					System.out.print("Please, enter decimal number "
							+ "you want to convert: ");
					int decimalNumber = sc.nextInt();
					if (isDecimalNumberValid(decimalNumber)) {
						System.out.println(decimal2Roman(decimalNumber));
						break mainLoop;
					}
						else {
						System.out.println("Please, enter positive integer from 1 to 100.");
						continue;
					}

				}

			}
			
			System.out.println("Please, enter 'R2D' or 'D2R.");
		}
	}

	

	/**
	 * Converts decimal numbers to Roman.
	 * 
	 * Takes int value as a parameter. Works only with numbers from 1 to 100.
	 * 
	 * @param number to convert to Roman.
	 * @return string of Roman number.
	 */
	public static String decimal2Roman(int number) {
		char[] Roman = new char[10];
		int i = 0;
		
		while(number > 0) {
			
			switch(number) {
			case 4:
				Roman[i] = 'I';
				i++;
				Roman[i] = 'V';
				number -= 4;
				break;
			case 9:
				Roman[i] = 'I';
				i++;
				Roman[i] = 'X';
				number -= 9;

				break;
			case 40:
				Roman[i] = 'X';
				i++;
				Roman[i] = 'L';
				number -= 40;

				break;
			case 90:
				Roman[i] = 'X';
				i++;
				Roman[i] = 'C';
				number -= 90;

				break;
			case 400:
				Roman[i] = 'C';
				i++;
				Roman[i] = 'D';
				number -= 400;

				break;
			case 450:
				Roman[i] = 'L';
				i++;
				Roman[i] = 'D';
				number -= 450;

				break;
			case 900:
				Roman[i] = 'C';
				i++;
				Roman[i] = 'M';
				number -= 900;

				break;
			case 950:
				Roman[i] = 'L';
				i++;
				Roman[i] = 'M';
				number -= 950;

				break;
			
			}
			
			
			if(number > 1000) {
				 Roman[i] = 'M';
				number -= 1000;   // 1114-1000 = 114
				i++;
				
			}
			
			else if(number > 500) {
				 Roman[i] = 'D';
				number -= 500;
				i++;
			}
			
			else if(number > 100) {
				 Roman[i] = 'C';
				 number -= 100; // 114-100 = 14
				 i++;
				
			}
			
			else if(number > 50) {
				 Roman[i] = 'L';
				 number -= 50;
				 i++;
				
			}
			
			else if(number > 10) {
				 Roman[i] = 'X';
				 number -= 10; //14-10 = 4
				 i++;
				
			}
			else if(number > 5) {
				 Roman[i] = 'V';
				 number -= 5;
				 i++;
				
			}
			else if(number > 1) {
				 Roman[i] = 'I';
				 number -= 1;
				 i++;
				
			}
		}

		String str = new String(Roman);
		return str;
	}

	/**
	 * Converts Roman numbers to decimal.
	 * 
	 * Takes string value with Roman number as a parameter.
	 * 
	 * At first method validates if input string could be Roman number. After method
	 * uses algorithm to convert Roman numeral to decimal.
	 * 
	 * @param romanNumber
	 * @return decimal representation of Roman number
	 */

	public static int roman2Decimal(String romanNumber) {
		
		char[] romans = romanNumber.toCharArray();
		int sum = 0 ;
		
		for(int i = 0;i<romans.length ;i++) {
			
			if (i+1 < romans.length) {
			String string = romanNumber.toUpperCase().substring(i,i+2);
			
			switch(string) {
				case "IV":
					sum += 4;
					i += 2;
					break;
					
				case "IX":
					sum += 9;
					i += 2;
					break;
				case "XL":
					sum += 40;
					i += 2;
					break;
				case "XC":
					sum += 90;
					i += 2;
					break;
				case "CD":
					sum += 400;
					i += 2;
					break;
				case "LD":
					sum += 450;
					i += 2;
					break;
				case "CM":
					sum += 900;
					i += 2;
					break;
				case "LM":
					sum += 950;
					i += 2;
					break;
			}
			
		}
					
		
//			System.out.println(sum);
			if(Character.toUpperCase(romans[i]) == 'I') {
				sum += 1;
			}
			
			else if(Character.toUpperCase(romans[i]) == 'V') {
				sum += 5;
			}
			else if(Character.toUpperCase(romans[i]) == 'X') {
				sum += 10;
			}
			else if(Character.toUpperCase(romans[i]) == 'L') {
				sum += 50;
			}
			else if(Character.toUpperCase(romans[i]) == 'C') {
				sum += 100;
			}
			else if(Character.toUpperCase(romans[i]) == 'D') {
				sum += 500;
			}
			else if(Character.toUpperCase(romans[i]) == 'M') {
				sum += 1000;
			}
			
			
			
		}
		return sum;
		
	}


	/**
	 * Validation for Roman numbers.
	 * 
	 * Use regular expression which is checking if string really could be Roman
	 * number.
	 * 
	 * @param romanNumber
	 * @return true if String is Roman number
	 */
	public static boolean isRomanNumberValid(String romanNumber) {
		return !(romanNumber.toLowerCase().matches(".*"+ "[^ivxlcdm]+" + ".*"));
	}
	
	public static boolean isDecimalNumberValid(int decimalNumber) {
		return decimalNumber == (int)decimalNumber;
	}
}
