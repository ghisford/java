//package com.itbullz.nzima;
//import java.io.InputStream;
//import java.util.Scanner;
//public class AddNumbers {
//    
//    public static void main(String[] args) {
//            
//    	System.out.println("enter numbers to add: \n");
//    	
//    	Scanner sc = new Scanner(System.in);
//    	
//    	
//    	if(sc.hasNextInt()) {
//    		
//    		int num1 = sc.nextInt();
//    		int num2 = sc.nextInt();
//    		System.out.println(num1 + "+" + num2+ "=" + (num1+num2));
//    	}
//    	
//    	else if(sc.hasNextFloat()) {
//		    		
//		    		float num1 = sc.nextFloat();
//		    		float num2 = sc.nextFloat();
//		    		System.out.println(num1 + "+" + num2+ "=" + (num1+num2));
//		    	}
//    }
//}
//    


package com.itbullz.nzima;
import java.io.InputStream;
import java.util.Scanner;

public class AddNumbers {
    
    public static void main(String[] args) {
            
    	System.out.println("enter numbers to add: \n");
    	if(args[0].contains(".") || args[1].contains(".")){
    	    
    	    
    	    System.out.println("the floating sum is: " + (Double.parseDouble(args[0]) + Double.parseDouble(args[1])));
    	}
    	
		else{
	    
	    System.out.println("the Integer sum is: " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
    	}
    	
    }
        
}
        
     


     

