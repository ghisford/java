package com.itbullz.nzima;

import java.util.Scanner;

public class ConvertDecimalToRoman2 {
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
					} else {
						System.out.println("You entered invalid Roman number. "
								+ "Please, try one more time.");
						continue;
					}
				}
			} else if (mode.equalsIgnoreCase("D2R")) {
				while (true) {
					System.out.print("Please, enter decimal number "
							+ "you want to convert: ");
					int decimalNumber = sc.nextInt();
					if (isDecimalNumberValid(decimalNumber)) {
						System.out.println(decimal2Roman(decimalNumber));
						break mainLoop;
					} else {
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
		<write your code here>
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

	public static int roman2Decimal(String str) {
	       int value(char r){
	          
	              if (r == 'I')
	                  return 1;
	              if (r == 'V')
	                  return 5;
	              if (r == 'X')
	                  return 10;
	              if (r == 'L')
	                  return 50;
	              if (r == 'C')
	                  return 100;
	              if (r == 'D')
	                  return 500;
	              if (r == 'M')
	                  return 1000;
	              return -1;
	       }
	       
	       
	      
	              // Initialize result
	              int res = 0;
	              String str;
	       
	              for (int i = 0; i < str.length(); i++) {
	                  // Getting value of symbol s[i]
	                  int s1 = value(str.charAt(i));
	       
	                  // Getting value of symbol s[i+1]
	                  if (i + 1 < str.length()) {
	                      int s2 = value(str.charAt(i + 1));
	       
	                      // Comparing both values
	                      if (s1 >= s2) {
	                          // Value of current symbol
	                          // is greater or equalto
	                          // the next symbol
	                          res = res + s1;
	                      }
	                      else {
	                          // Value of current symbol is
	                          // less than the next symbol
	                          res = res + s2 - s1;
	                          i++;
	                      }
	                  }
	                  else {
	                      res = res + s1;
	                  }
	              }
	       
	              return res;
	          
	       
	    
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
	    <write your code here>
	}
	
	public static boolean isDecimalNumberValid(int decimalNumber) {
		<write your code here>
	}
}