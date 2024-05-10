package assignments;

import java.util.Scanner;

public class Assignment04 {

	// W.A Java program for accepting a number from user and test whether it is positive or negative
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to check whether Positive or Negative");
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Entered number is Positive");
		}
		
		else if (num<0)
		{
			System.out.println("Entered number is Negative");
		}
		
		else
		{
			System.out.println("Entered number is Zero");
		}	
		
		
		sc.close();

	}

}
