package com.bridgelabzday2;

import java.util.Scanner;

public class AirthmaticsOperator {
	
	    public static void main(String[] args) 
	    {
	        int a, b,c, opt, a1, a2, a3,a4;
	        double div;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter first number:");
	        a = s.nextInt();
	        System.out.print("Enter second number:");
	        b = s.nextInt();
	        System.out.print("Enter third number:");
	        c = s.nextInt();
	        while(true)
	        {
	            System.out.println("Condition 1");
	            System.out.println("condition 2");
	            System.out.println("condition 3");
	            System.out.println("condition 4");
	            System.out.println(" Exit");
	            opt = s.nextInt();
	          
	            switch(opt)
	            {
	                case 1:
	                a1 = a+b*c;
	                System.out.println("Result:"+a1);
	                break;
	 
	                case 2:
	                a2 = c+a/b;
	                System.out.println("Result:"+a2);
	                break;
	 
	                case 3:
	                a3 = a%b+c;
	                System.out.println("Result:"+a3);
	                break;
	 
	                case 4:
	                a4 = a*b+c;
	                System.out.println("Result:"+a4);
	                break;    
	 
	                case 5:
	                System.exit(0);
	            }
	        }
	    }
	}