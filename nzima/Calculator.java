package com.itbullz.nzima;
import java.util.Scanner;

public class Calculator {
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(Integer.parseInt(args[0]) 
				+ Integer.parseInt(args[1]));
	}

//	    public static int add(int x, int y){
//	        
//	        return x + y;
//	    }
//	    
//	      public static int subtract(int x, int y){
//	        
//	        return x - y;
//	    }
//	    
//	      public static int multiply(int x, int y){
//	        
//	        return x * y;
//	    }
//	 public static int divide(int x, int y){
//	        
//	        return x / y;
//	    }
//
//	    
//	    public static void main(String[] args){
//	        Scanner sc = new Scanner(System.in);
//	        
//	        System.out.println("enter 1 for add, 2 for subtract, 3 for multiply, 4 for division, enter 0 to quit");
//	        int choice = 1;
//	        while(true){
//	        choice = sc.nextInt();
//	        if(choice == 0){
//	        	System.out.println("quit successfully");
//	        	break;
//	        }
//	        int first_op = sc.nextInt();
//	        int second_op = sc.nextInt(); 
//	        
//	        
//	        switch(choice){
//	        	
//	            case 1:
//	                System.out.println( first_op + "+" + second_op + "=" + add(first_op,second_op));
//	                break;
//	                
//	            case 2:
//	                System.out.println( first_op + "-" + second_op + "=" + subtract(first_op,second_op));
//	            break;
//	            
//	            case 3:
//	                System.out.println( first_op + "x" + second_op + "=" + multiply(first_op,second_op));
//	                break;
//	                
//	            case 4:
//	                System.out.println( first_op + "/" + second_op + "=" + divide(first_op,second_op));
//	                break;
//	            
//	         
//	            
//	            default:
//	                System.out.println("incorrect choice. Try again");
//	                break;
//	        }
//	        }
//	        
//	    }

	

}
