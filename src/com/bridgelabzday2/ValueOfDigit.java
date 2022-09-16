package com.bridgelabzday2;

import java.util.Scanner;

public class ValueOfDigit {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		int hundreds = 0;
		int tens = 0;
		int ones = 0;

	         
		System.out.print("Enter number: ");
		int number = input.nextInt();

		if (number <= 999 && number > 99)  
		{

	
			hundreds = number / 100;
			System.out.printf("Hundreds place digit: " + hundreds);

			//Displays tens digit
			tens = (number - (hundreds*100)) / 10;  
			System.out.printf("\nTens place digit: " + tens);


			ones = (number - (tens*10) - (hundreds*100)); 
			System.out.printf("\nOnes place digit: " + ones);   
		}
		
		else                                                                    
		{      
			if (number > 999)
				System.out.println("\nError! Number more then 3 digits.");
			if (number < 100)
				System.out.println("Error! Number less then 3 digits.");
		}



	}
}