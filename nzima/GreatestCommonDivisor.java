package com.itbullz.nzima;

import java.util.Scanner;

public class GreatestCommonDivisor {
	

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please, enter two numbers separated by space: ");
	String userInput = sc.nextLine();

	String[] inputArgumentsArray = userInput.split("\\s+");
	int number1 = Integer.parseInt(inputArgumentsArray[0]);
	int number2 = Integer.parseInt(inputArgumentsArray[1]);

	System.out.println(gcdRecursive(number1, number2));
	}
//	using pass by value works here only bse we are changing the values
//of firstNumber and secondNumber inside the same method


	public static int gcdRecursive(int firstNumber, int secondNumber) {
	    
        if(firstNumber> secondNumber && secondNumber!= 0){
            firstNumber = firstNumber % secondNumber;
            return gcdRecursive(firstNumber,secondNumber);
        }
        
         else if(firstNumber< secondNumber && firstNumber!= 0){
            secondNumber = secondNumber % firstNumber;
           return gcdRecursive(firstNumber,secondNumber);
        }
        
        else if (firstNumber == 0){
            return secondNumber;
        }
        else{
            return firstNumber;
        }
		
//        return 0;
}
	
}