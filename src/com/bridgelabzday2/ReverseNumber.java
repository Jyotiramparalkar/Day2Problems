package com.bridgelabzday2;

public class ReverseNumber   
{  
	public static void main(String[] args)   
	{  
		int number = 231;
		int reverse = 0;  
		while(number != 0)   
		{  
			int reminder = number % 10;  
			reverse = reverse * 10 + reminder;  
			number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}  
}  