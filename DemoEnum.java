package com.itbullz.nzima;

import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class DemoEnum {
public static void main() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please, enter message type to check it priority: ");
			String userInput = sc.next();

			if (isValidMessageType(userInput)) {
                switch(userInput){
                    case "A":
                        System.out.println("A " + MessageType.A.getPriorityType());
                        break;
                        
                     case "B":
                        System.out.println("B " + MessageType.B.getPriorityType());
                        break;

                     case "C":
                        System.out.println("C " + MessageType.C.getPriorityType());
                        break;

                     case "D":
                        System.out.println("D " + MessageType.D.getPriorityType());
                        break;
                        
                        

                }

				break;
			} else {
				System.out.println("Please, enter valid "
						+ "message type. Only 'A', 'B', 'C' or 'D' are allowed");
				continue;
			}

		}
		
		
		HashMap<String,String>Capitalcity= new HashMap<String,String>();
		Capitalcity.put("Uganda", "kampala");
		Capitalcity.put("kenya", "nairobi");
		
		System.out.println(Capitalcity.get("Uganda"));
		Capitalcity.remove("Uganda");
		System.out.println(Capitalcity);
		
		
   HashSet<Integer> numbers = new HashSet<Integer>();
   numbers.add(1);
   numbers.add(7);
   numbers.add(2);
   numbers.add(5);
   numbers.add(4);
   numbers.add(3);
   System.out.println(numbers);
		
		
				
		
	}

	private static boolean isValidMessageType(String userInput) {
        return !(userInput.toUpperCase().matches(".*"+ "[^ABCD]+" + ".*"));


	}

}


